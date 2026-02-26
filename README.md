Aula 01 Fundamentos de OO - Object Oriented Programming 
Microdesafio

Minha Classe CameraDigital possui os atributos: marca, nomeModelo e memoria de determinada camera. Tenho como métodos tirarFoto e gravarVideo, se a câmera estiver gravando ou tirando alguma foto, a memória portanto muda de valor. 

tirarFoto: Se câmera retornar 0, temos que ela não tirou nenhuma foto e pedimos ao usuário que faça isso. Se retornar 1, temos uma nova foto! Portanto, é adicionado mais 5 na memória (representando o tamanho desta foto)

gravarVideo: Semelhante ao funcionamento de tirarFoto, mas aqui, temos se o vídeo for maior que 15 (representando 15 minutos), o código avisa que ultrapassou deste tempo e não é válido, se for menor, ele grava com sucesso e adiciona mais 6 na memória da câmera.

Na main, SistemaPrincipal, consigo declarar novos objetos conforme as especificações da minha Classe, chamando os métodos e testando se realmente mudam o valor da minha memória.
