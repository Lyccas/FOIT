import Link from "next/link";
import styled from "styled-components";
import Center from "@/components/Center";

const StyledFooter = styled.footer`
  background-color: #222;
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  color: white;
  text-align: center;
`;
const Logo = styled(Link)`
  color:#fff;
  text-decoration:none;
  position: relative;
  z-index: 3;
`;
const Text = styled.a`
  color: #fff;
  text-decoration: none;
  position: relative;
  z-index: 3;
`;
const Wrapper = styled.div`
  display: flex;
  justify-content: space-between;
  padding: 20px 0;
`;

export default function Footer() {
  return (
    <StyledFooter>
      <Center>
        <Wrapper>
          <Logo href={'/'}>BSU-Webshop</Logo>
          <Text href={'/impressum'}>Impressum</Text>
          <Text href={'/datenschutz'}>Datenschutz</Text>
        </Wrapper>
      </Center>
    </StyledFooter>
  );
}