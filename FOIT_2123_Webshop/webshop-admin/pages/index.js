import Layout from "@/components/Layout"
import { useSession } from "next-auth/react";
import Link from "next/link";
import {useEffect, useState} from "react";
import axios from "axios";

export default function HomePage() {
  const {data: session} = useSession();
  const [products,setProducts] = useState([]);
  const [editedCategory, setEditedCategory] = useState(null);
  const [categories,setCategories] = useState([]);
  const [orders,setOrders] = useState([]);
  useEffect(() => {
    axios.get('/api/products').then(response => {
      setProducts(response.data);
    });
  }, []);
  useEffect(() => {
    fetchCategories();
  }, []);
  useEffect(() => {
    axios.get('/api/orders').then(response => {
      setOrders(response.data);
    });
  }, []);
  function fetchCategories() {
    axios.get('/api/categories').then(result => {
      setCategories(result.data);
    });
  }
  return (
      <Layout>
        <div className="text-blue-900 flex justify-between">
          <h2>
            Hallo, <b>{session?.user?.name}</b>
          </h2>
          <div className="flex bg-gray-300 gap-1 text-black rounded-lg overflow-hidden">
            <img src={session?.user?.image} alt="" className="w-6 h-6"></img>
            <span className="px-2">
              {session?.user?.name}
            </span>
          </div>
        </div>

        <h1 className="mt-4">Produkte</h1>
        <table className="basic mt-2">
          <thead>
          <tr>
            <td>Produkt Name</td>
            <td></td>
          </tr>
          </thead>
          <tbody>
          {products.map(product => (
              <tr key={product._id}>
                <td>{product.title}</td>
              </tr>
          ))}
          </tbody>
        </table>

        <h1 className="mt-4">Kategorien</h1>
        {!editedCategory && (
            <table className="basic mt-4">
              <thead>
              <tr>
                <td>Kategorie</td>
                <td>Elternkategorie</td>
                <td></td>
              </tr>
              </thead>
              <tbody>
              {categories.length > 0 && categories.map(category => (
                  <tr key={category._id}>
                    <td>{category.name}</td>
                    <td>{category?.parent?.name}</td>
                  </tr>
              ))}
              </tbody>
            </table>
        )}

        <h1 className="mt-4">Orders</h1>
        <table className="basic">
          <thead>
          <tr>
            <th>Datum</th>
            <th>Bezahlt</th>
            <th>Rechung</th>
            <th>Produkte</th>
          </tr>
          </thead>
          <tbody>
          {orders.length > 0 && orders.map(order => (
              <tr key={order._id}>
                <td>{(new Date(order.createdAt)).toLocaleString()}
                </td>
                <td className={order.paid ? 'text-green-600' : 'text-red-600'}>
                  {order.paid ? 'JA' : 'NEIN'}
                </td>
                <td>
                  {order.name} {order.email}<br />
                  {order.city} {order.postalCode} {order.country}<br />
                  {order.streetAddress}
                </td>
                <td>
                  {order.line_items.map(l => (
                      <>
                        {l.price_data?.product_data.name} x
                        {l.quantity}<br />
                      </>
                  ))}
                </td>
              </tr>
          ))}
          </tbody>
        </table>
      </Layout>
  );
}