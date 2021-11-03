import { Page } from "./styles";
import { DivUsuario, Content, BoxLeft, BoxRight } from "./styles";
import { UserProfilePic, Message, List, Maps } from "../../../components";

export const UnitMaps = ({ usuario }) => {
  return (
    <Page>
      <DivUsuario>
        <UserProfilePic nome={usuario.paciente.nome} subtexto=" Paciente" />
      </DivUsuario>
      <Content>
        <BoxLeft>
          <Message textOne="Unidades próximas a você" textTwo="" />
          <List />
        </BoxLeft>
        <BoxRight>
          <Maps />
        </BoxRight>
      </Content>
    </Page>
  );
};
