# language: pt
Funcionalidade: Quiz
  Como um jogador do Quiz da Caverna do Dragão
  Otavio deseja acessar o quiz
  Para que ele possa se divertir

  Cenário de Fundo:
    Dado que "Otávio" acessa a aplicação da Caverna do Dragão

  Cenário: Informar o nome
    Quando ele informa um nome
    E clica em jogar
    Então ele deve visualizar a primeira página do Quiz

  Esquema do Cenário: Responder o Quiz até o final
    Dado que o titulo "<pergunta>" "Pergunta <pergunta> de 15" esteja na tela
    Entao clicar na alternativa "<resposta>"
    E clicar em "Confirmar"

    Exemplos:
      | pergunta | resposta                                                                                                                          |
      | 1        | um jogo de RPG chamado Dungeons and Dragons                                                                                       |
      | 2        | Hank, Bobby, Eric, Presto, Sheila e Diana                                                                                         |
      | 3        | Hank                                                                                                                              |
      | 4        | Era a unicórnio que sempre andava ao lado de Bobby                                                                                |
      | 5        | Era o principal antagonista da série. Era um feiticeiro maléfico com grandes habilidades místicas.                                |
      | 6        | Nenhum dos protagonistas principais empunhava uma espada                                                                          |
      | 7        | Era a acrobata e possuia um bastão mágico como arma                                                                               |
      | 8        | Era uma das antagonistas da série. Era uma Deusa Dragoa de cinco cabeças e guardiã do cemitério dos dragões                       |
      | 9        | Era a irmã mais velha do Bobby e usava uma capa da invisibilidade                                                                 |
      | 10       | Era um poderoso mago e guia para os protagonistas, lhes dando armas no início da aventura e tentando ajudá-los a voltar para casa |
      | 11       | Eric, Diana, Bobby e Presto                                                                                                       |
      | 12       | 27 episódios e 3 temporadas                                                                                                       |
      | 13       | Entraram em um portal que apareceu durante o passeio na montanha russa                                                            |
      | 14       | Em 1986                                                                                                                           |
      | 15       | Vingador

  Cenario: Verificar página de resultados
    Quando ele estiver na pagina de resultados
    Entao verificar se o título "Tela de Resultado:" está presente na tela
    E clicar na seta para voltar para página inicial