/* Autores do Jogo
 Otavio Ribeiro dos Santos
 Gian de Manincor

Materia: Projeto Integrador-I  1º Semestre Turma A Noite
Centro Universitário Senac - Santo Amaro (07/06/2019)
 */
package projeto_omestredocalculo;

import java.util.Scanner;

public class OMestreDoCalculo {

    static Scanner input = new Scanner(System.in);

    //metodo Menu com opção para entrar ou sair do jogo.
    public static int menu() {
        int opcao;
        String nome, sexo = null;

        do {
            // Menu inicial do jogo.
            System.out.println("*------------ O MESTRE DO CÁLCULO ---------------*");
            System.out.println("Seja bem - vindo(a) ao nosso jogo!");
            System.out.println("Para continuar, digite alguma das opções a seguir:");
            System.out.println("           =================================");
            System.out.println("           |     1 - Entrar no jogo.       |");
            System.out.println("           |_______________________________|");
            System.out.println("           |                               |");
            System.out.println("           |     2 - Sair do jogo.         |");
            System.out.println("           =================================\n");
            System.out.println("Digite uma das opções:");
            opcao = input.nextInt();

            switch (opcao) { //Este código foi feito para o usuario escolher entre 1 para iniciar o jogo e 2 para sair.
                case 1:
                    break;
                case 2:
                    System.exit(0);//Caso a opção seja 2, o jogo encerra, (Você vera muito desse mesmo código durante todo o jogo)
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 1 && opcao != 2); // Este código foi feito para repetir o código acima até que uma das opções sejam selecionadas.
        return opcao;
    }

    //metodo para escolher nome do jogador.
    public static String nomedoJogador() { //Função feita para criação do personagem 

        String nomejogador; //Utilizada em todo o enredo, aqui se define o nome do personagem principal que ira aparecer no texto do jogo.
        System.out.println("Muito bem! Agora vamos dar inicio a criação do seu personagem.");
        System.out.println("Digite seu nome: ");
        input.nextLine();
        nomejogador = input.nextLine();
        return nomejogador;
    }

    //metodo para escolher sexo do jogador.
    public static String sexodoJogador() { //Função criada para selecionar o sexo do(a) jogador(a) principal.
        String sexo = null;
        for (int cont = 1; cont <= 3; cont++) { //Definindo um laço de repetição para escolha do sexo.
            System.out.println("Digite o sexo:  \nOpções: (Homem) ou (Mulher).");
            sexo = input.nextLine().toLowerCase(); //toLowerCase utilizado para tudo que o usúario digitar em Maiúsculo ficar em minúsculo, ou seja não ira fazer diferença se digitar HOMEM ou homem.

            if (cont >= 1 && cont < 3) { // Aqui é feito uma repetição que se a opçao for diferente de "homem" ou "mulher" aparecer a mensagem sexo inválido! Tente novamente...".
                if (!"mulher".equals(sexo) && !"homem".equals(sexo)) {
                    System.out.println("Sexo inválido! Tente novamente...");
                } else {
                    break;
                }
            } else if (cont == 3 && !"mulher".equals(sexo) && !"homem".equals(sexo)) { // Aqui foi definido um encerramento de jogo caso ele erre o sexo 3 vezes.
                System.out.println("Você errou muitas vezes. Inicie o jogo novamente...");
                System.exit(0);
            }
        }
        return sexo;
    }

    //metodo que conta a história do game. Nessa etapa o jogador decide por qual caminho quer seguir,
    // e cada opcão segue uma história diferente. Após escolher o metodo decisao trilha o caminho.
    public static String historia(String nomejogador) { // Esta função é para dar inicio a breve historia do jogo e o que está acontecendo no momento no planeta.
        String historia;

        do {
            System.out.println("Bem-vindo ao planeta Uriel, " + nomejogador + ". Você é um meio-Elfo Mago e vive no planeta mais evoluído de sua galáxia,\n"
                    + "graças aos quatros antigos Mestres Dos Cálculos, a tecnologia deste planeta é a mais avançada até o momento.\n"
                    + "Os quatros antigos Mestres Dos Cálculos, esconderam um pergaminho que esconde o segredo para se tornar um \n"
                    + "Mestre Do Cálculo, este pergaminho está sobre custódia dos seus discípulos Thönir e Mjönir, os dois anões \n"
                    + "Ferreiros/Engenheiros que atualmente são os dois novos Mestres dos Cálculos, o pergaminho se encontra \n"
                    + "dentro da cidade dos cálculos. O planeta está comemorando hoje 2050 anos, todos estão comemorando.\n "
                    + "Até que de repente, todos os aparelhos tecnológicos receberam uma mensagem de vídeo, ameaçando a todos inclusive o planeta. \n"
                    + "O ser estranho que gravou e enviou este vídeo ao vivo é conhecido como Rei Hellguz, um Orc que tem como objetivo se tornar superior a todos.\n"
                    + "E este vídeo diz o seguinte; \n"
                    + "\n"
                    + "- Atenção a todos os seres detestáveis deste planeta, me entreguem agora o pergaminho do Mestre Do Cálculo, ou\n"
                    + "irei destruir seu planeta com o poder do meu meteoro! Me entreguem agora ou irei buscar-lo com meus soldados!\n "
                    + "\n"
                    + "- E obviamente os anões guardiões não entregaram o pergaminho, eles já haviam construído uma máquina que consegue\n"
                    + "destruir e vaporizar planetas ou meteoros. Mas o Rei orc invadiu o planeta Uriel com seus melhores soldados Orcs, e aprisionaram os anões.\n"
                    + "E agora você " + nomejogador + " tem como objetivo salvar seu planeta e ir em busca do pergaminho do Mestre Do Cálculo para se torna\n"
                    + "um dos Mestres.\n");

            System.out.println(" - " + nomejogador + " acaba de sair de sua cidade, onde vivem os humanos, e agora ele se depara com dois caminhos.\n");
            System.out.println(nomejogador + ": Pra onde devo ir ? No caminho A é a cidade dos elfos, onde posso me encontrar com meu amigo Togriel e seguir a jornada com ele. \n"
                    + "\n"
                    + "Mas também posso ir pelo caminho B lá é a cidade dos anões, por ali eu chego mais rápido a cidade dos cálculos, mas também não me encontro com Togriel, \n"
                    + "estou indeciso, para onde devo ir?\n");
            System.out.println("");
            System.out.println("-----------------------ESCOLHA O CAMINHO--------------------------\n"
                    + "(A) Cidade dos elfos\n"
                    + "(B) Cidade dos Anões.");

            historia = input.nextLine().toLowerCase();

            if ("a".equals(historia)) {
                System.out.println("Certo, vou pela cidades dos elfos, é melhor, assim terei um amigo para me ajudar foi uma boa escolha.\n");
                break;
            }
            if ("b".equals(historia)) {
                System.out.println("Preciso me apressar, pois o mundo está em jogo, aliás Togriel é experto e forte vou pela Cidade dos Anões.\n");
                break;
            } else {
                System.out.println("Opção inválida, insira opções entre a ou b por gentileza.\n");

            }
        } while (!"a".equals(historia) || !"b".equals(historia));
        return historia;
    }

    public static String desafio01_A(String nomejogador) { //Função criada para o primeiro desafio, resulta ao final bom caso a escolha do jogador foi a, A Cidade dos elfos.
        String desafio01A = null;
        Boolean tentativa = false;
        do {
            System.out.println("- Em meio de uma chuva e relâmpagos, " + nomejogador + " se depara com um orc carregando seu amigo Togriel, e grita pelo nome dele\n"
                    + nomejogador + ": EEEEEEEEEI TOGRIEL SOU EU  quem é este orc ? e por qu...\n"
                    + "Togriel: FUJA! FUJA!!! ELE E FORTE!\n");
            System.out.println("Hurtzdan: Odeio Relâmpagos! Hã? Olha só meu dia de sorte, outra raça para capturar e estudar!! \n"
                    + nomejogador + ": Seu MONSTRO solte Togriel já! Ou irei mata-lo !\n"
                    + "Hurtzdan: HAHA Meio-Elfo idiota! ousa me desafiar ?? HAHAHA Irei capturá-lo também, você não é \n"
                    + "forte o suficiente para me deter acha que pode com o grande Hurtzdan ? HA HA HA HA! nem Fogo e \n"
                    + "nem Gelo me assustam, por que acha que me você me assustaria ? VAMOS A LUTA!");
            System.out.println("");
            System.out.println("------------QUESTÃO DESAFIO-------------");
            System.out.println("(Você inicialmente possui 28 de mana podendo\n"
                    + "lançar magias de fogo gelo e raio, você precisa zerar os Pontos de vida de Hurtzdan\n"
                    + "o mesmo possuí 44 HP e você só pode lançar certa quantidade de magia com base ao seus\n"
                    + "28 pontos de magia. Segue a lista de mana gasta e dano no Orc Hurtzdan:)\n"
                    + "---- Lista de dano, Magias e Mana gasta----*\n"
                    + "Fogo 7 de dano e gasta 11 de mana por canalização\n"
                    + "Gelo 5 de dano e gasta 9 de mana por canalização\n"
                    + "Raio 9+2(BONUS) de dano e gasta 7 de mana."
                    + "\n");
            System.out.println("------------RESPONSA O DESAFIO-----------");
            System.out.println("Com base a seus 28 pontos de mana, quais das alternativas está correta para derrotar Hurtzdan? \n"
                    + "(A)Lançar Raio 4x \n"
                    + "(B)Lançar Fogo 3x \n"
                    + "(C)Lançar Gelo 5x\n");
            System.out.println("Responda:");
            desafio01A = input.nextLine().toLowerCase();

            switch (desafio01A.charAt(0)) {//Escolhas múltiplas das questões do desafio, letra A para corretar, b e c para incorreta.
                case 'a':
                    System.out.println("Parabéns você subiu de nível e ganhou + 20 de mana.\n");
                    System.out.println("Você conseguiu derrotar Hurtzdan parabéns!\n");
                    break;
                case 'b':
                    System.out.println("Você errou! Hurtzdan: HA HA isso fez cócegas tome isso! FACA ESMAGACRÂNIOS! ");
                    break;
                case 'c':
                    System.out.println("Você errou! Hurtzdan: HA HA você chama isso de ataque? Tome isso FACA ESMAGACRÂNIOS! ");
                    break;
                default:
                    System.out.println("Opção invalida!");
                    System.exit(0);
                    break;
            }

        } while (!"a".equals(desafio01A));

        return desafio01A;
    }

    public static String desafio01_B(String nomejogador) { //Funções com o final B se resulta ao final ruim, morte de Togriel. Quando o jogador seleciona ir pela opção B Cidade dos Anões.
        String desafio01B = null;
        for (int i = 0; i < 2; i++) {
            System.out.println("- Em meio de uma tempestade, " + nomejogador + " se depara com uma orc aparentemente com muita fome aos berros.\n"
                    + "\n"
                    + "????: CARNE, CARNE! PRECISO DE CARNE!!! MAS QUE FRIO, ODEIO LUGARES GELADOS! Sinto falta da minha\n"
                    + "caverna e a minha Fogueira! Hã? Olha veja só, um humano? Nããão você tem cheiro de humano mas fede\n"
                    + "a elfo! Horas veja só o único meio-elfo que encontrei até agora, que sorte sera maravilhoso devora-lo !\n"
                    + "\n"
                    + nomejogador + ": Me devorar ? Já mais criatura horrenda, e como ousa chamar minha raça de fedida ? Prepare-se, irei\n"
                    + "lhe dar uma lição nunca mais ira mexer com um meio-elfo!\n"
                    + "\n"
                    + "Hurtsha: Você um meio humano e meio elfo ira derrota a mim? A veloz Hurtsha? HA HA HA HA Não me faça rir\n"
                    + "pode vir com tudo pequena futura refeição!\n"
                    + "\n"
                    + "Inimiga orc: Hurtsha 44 HP\n"
                    + "Hurtsha parece não ter muito medo de Fogo e nem Raios, esta muito confiante de sua vitória.\n"
                    + "Dê um fim a sua existência e mostre do que você " + nomejogador + " é capaz!");
            System.out.println("");
            System.out.println("------------QUESTÃO DESAFIO-------------");
            System.out.println("Você inicialmente possui 28 de mana podendo lançar magias de fogo gelo e raio, \n"
                    + "você precisa zerar os Pontos de vida de Hurtsha, ela possuí 44 HP e você só pode lançar certa quantidade \n"
                    + "de magia com base ao seus 28 pontos de magia. Segue a lista de mana gasta e dano na Hurtsha\n"
                    + "\n"
                    + "---- Lista de dano, Magias e Mana gasta de: " + nomejogador + " ----\n"
                    + "Fogo 3 de dano e gasta 11 de mana por canalização\n"
                    + "Raio 5 de dano e gasta 9 de mana por canalização\n"
                    + "Gelo 9+2(BÔNUS) de dano e gasta 7 de mana.");
            System.out.println("------------RESPONSA O DESAFIO-----------");
            System.out.println("Com base a seus 28 pontos de mana, qual das alternativas esta correta ?\n"
                    + "(A)Lançar Raio 4x\n"
                    + "(B)Lançar Fogo 3x\n"
                    + "(C)Lançar Gelo 5x\n");
            System.out.println("Responda:");
            desafio01B = input.nextLine().toLowerCase();

            if ("c".equals(desafio01B)) {
                System.out.println("Parabéns você subiu de nivel e ganhou + 20 de mana.\n");
                System.out.println(nomejogador + ": Finalmente derrotei essa criatura horrenda! Vamos em frente, preciso achar o pergaminho\n"
                        + "e dar um fim aquele meteoro !\n");
                System.out.println("");
                break;
            }
            if (i == 0 && !"c".equals(desafio01B)) {
                System.out.println("Hurtsha: HAHAHA COMIDA !!!");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"c".equals(desafio01B)) {
                System.out.println("Hurtsha: HAHAHA COMIDA !!!");
                System.out.println("Você perdeu o jogo!\n");
                System.exit(0);
            }

        }
        return desafio01B;
    }

    public static String desafio02_A(String nomejogador) {//Função criada para o primeiro desafio, resulta ao final bom caso a escolha do jogador foi a, A Cidade dos elfos.
        String desafio02A = null;
        for (int i = 0; i < 2; i++) {
            System.out.println("- Ao derrotar Hurtzdan e salvar Togriel, vocês avançam para o segundo vilarejo em direção\n"
                    + "a ponte da cidade dos cálculos, mas Togriel reclama de fome e diz\n"
                    + "\n"
                    + "Togriel: Ei " + nomejogador + " Vamos comer algo, estou morto de fome! Olha ali uma taverna\n"
                    + " vamos lá eles podem ter algo delicioso! \n"
                    + "\n"
                    + nomejogador + ": Ah vamos sim, uma refeição não fará mal algum.\n"
                    + "\n"
                    + "- Ao entrar na taverna " + nomejogador + " e Togriel se deparam com uma orc de armadura pesada segurando\n"
                    + "uma cabeça de humano, e ela diz;\n"
                    + "\n"
                    + "????: Veja só, humanos são muito fracos, eu os avisei para me preparar um bom drink e me oferecem\n"
                    + "uma porcaria dessas? Como pode não ter bebida de sangue de elfo!? Tiveram o que mereciam! \n"
                    + "?? Olha só mais dois humanos que irem matar, isso está divertido HA HA HA, ei espera aí, esses dois\n"
                    + "vocês são ELFOS!! Finalmente terei uma bebida digna agora preparem-se para morrer!\n"
                    + "\n"
                    + nomejogador + " e Togriel: não se aproxime orc imundo Lançar RAIO !!\n"
                    + "\n"
                    + "Ashork: HA HA HA, que magias fracas essas a de vocês, e seus ignorantes, eu sou uma orc! Meu nome é Ashork.\n"
                    + "E nenhum poder de gelo ou raio pode penetrar minha armadura de prata! É uma das melhores do meu planeta,\n"
                    + "desistam não iram conseguir nada FUAHAHAHAHHA.\n");
            System.out.println("");
            System.out.println("-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Ashork possui uma armadura de prata de 55kg, ataques físicos magias de gelo e raio são inúteis, então resta utilizar sua magia de fogo,\n"
                    + "você precisa fundir a armadura de prata de Ashork e derrete-la junto com a armadura, para isso utilize a sua magia de fogo,\n"
                    + "lembrando sua mana atual é 48 e você não pode zerá-la. Quanto mais você lançar um magia de fogo menor o custo de mana,\n"
                    + " mas também menor a temperatura alcançada. Se para cada 1kg de prata é necessário 960 ºC, quantos graus Celsius, \n"
                    + "são necessários para fundir 55kg de prata?\n"
                    + "\n"
                    + "--------------------RESPONDA O DESAFIO-----------------\n"
                    + "(A) lançar fogo 5x 9.740 ºC mana gasta 11|\n"
                    + "(B) lançar fogo 2x 26.400 ºC mana gasta 29|\n"
                    + "(C) lançar fogo 6x 16.820ºC mana gasta 12|\n");
            System.out.println("Responda: ");
            desafio02A = input.nextLine().toLowerCase();
            if ("b".equals(desafio02A)) {
                System.out.println("Parabéns você venceu, recebeu + 30 de mana e aprendeu a magia\n"
                        + "\n"
                        + "[Parede de Prata Elemental].\n"
                        + "\n"
                        + "Uma Habilidade tanto defensiva quanto agressiva.\n"
                        + "Você pode usar Parede de Prata com elemento a sua escolha ou sem, com sua escala de 20x20 metros, possuí o custo de 30 mana sem utilizar\n"
                        + "nenhum elemento. Já com elemento, tem um custo adicional para cada um deles. 7 para elemento de raio, 12 para elemento de fogo e 10\n"
                        + "para elemento de Gelo, lembrando que cada elemento tem uma especialidade, Fogo queima o inimigo constantemente ao tocar na parede,\n"
                        + "raio, suga as energias e os deixam fracos e Gelo que reflete ataques ou objetos físicos.\n"
                        + "\n"
                        + nomejogador + ": não foi uma boa ideia passarmos nessa taverna Togriel ! Quase morremos... ¬ ¬\n"
                        + "Togriel: Me desculpe eu estava faminto, mas agora já passou comi bem hump :P\n");
                break;
            }
            if (i == 0 && !"b".equals(desafio02A)) {
                System.out.println("Ashork: Eu disse a vocês que seus esforços seriam inúteis, MORRAM!\n");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"b".equals(desafio02A)) {
                System.out.println("Ashork: Eu disse a vocês que seus esforços seriam inúteis, MORRAM!\n");
                System.out.println("Você perdeu o jogo!.\n");
                System.exit(0);
            }

        }
        return desafio02A;
    }

    public static String desafio02_B(String nomejogador) { //Funções com o final B se resulta ao final ruim, morte de Togriel. Quando o jogador seleciona ir pela opção B Cidade dos Anões.
        String desafio02B = null;
        for (int i = 0; i < 2; i++) {
            System.out.println("- Ao derrotar Hurtsha, " + nomejogador + " segue saindo da cidade dos anões, direto para a ponte dos cálculos,\n"
                    + "mas se depara com uma batalha de orcs, um deles tem uma armadura com uma luz muito brilhante,\n"
                    + "algo como prata, e o outro com uma enorme faca. Você acaba se aproximando pois eles estão atrapalhando,\n"
                    + "o caminho para chegar na ponte da cidade dos cálculos.\n");

            System.out.println("????: Eu não acredito que você devorou a minha pesquisa da raça deste planeta Ashork !\n");

            System.out.println("Ashork: Algum problema? Ele seria devorado de qualquer forma mesmo, e eu estava faminta então não me\n"
                    + "aborreça Hurtzdan! Senão eu o devoro também!");

            System.out.println("Hurtzdan: Você não seria capaz sua Orc fedorenta, vai pagar pelo o que fez com a minha pesquisa sua TOLA!\n"
                    + "CORTE ESMAGA CRÂNIOS !!\n"
                    + "");
            System.out.println("tchim... (a adaga quebra com o impacto da armadura de Arshork )\n");

            System.out.println("Hurtzdan: Hã ? Como pode? A minha querida adaga!\n");

            System.out.println("Ashork: HA HA HA HAHAHA!! Bem feito, você sempre foi um fraco Hurtzdan, agora morra!\n"
                    + "MACHADO SANGRENTO !!\n");

            System.out.println("Splash... (Sangue jorrando)\n");

            System.out.println(nomejogador + ": Ela acabou de decapitar um aliado ??! que raça mais violenta e trairá !! ei... espere um pouco\n"
                    + "aquele colar... aquela roupa... TOGRIEL??? ELA DEVOROU TOGRIEL MEU MELHOR AMIGO !???!!\n");

            System.out.println("Ashork: quem está reclamando aí? Olha outro elfo para devorar!\n");

            System.out.println(nomejogador + ": SUA MALDITA JÁ MAIS IREI PERDOA-LA AAAAAAAAA!!!!!\n");

            System.out.println("-------------------QUESTÃO DESAFIO--------------------------");
            System.out.println("");
            System.out.println("-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Ashork possui uma armadura de prata de 55kg, ataques físicos magias de gelo e raio são inúteis, então resta utilizar sua magia de fogo,\n"
                    + "você precisa fundir a armadura de prata de Ashork e derrete-la junto com a armadura, para isso utilize a sua magia de fogo,\n"
                    + "lembrando sua mana atual é 48 e você não pode zerá-la. Quanto mais você lançar um magia de fogo menor o custo de mana,\n"
                    + " mas também menor a temperatura alcançada. Se para cada 1kg de prata é necessário 960 ºC, quantos graus Celsius, \n"
                    + "são necessários para fundir 55kg de prata?\n"
                    + "\n"
                    + "--------------------RESPONDA O DESAFIO-----------------\n"
                    + "(A) lançar fogo 5x 9.740 ºC mana gasta 11|\n"
                    + "(B) lançar fogo 2x 26.400 ºC mana gasta 29|\n"
                    + "(C) lançar fogo 6x 16.820ºC mana gasta 12|\n");
            System.out.println("Responda:");
            desafio02B = input.nextLine().toLowerCase();
            if ("b".equals(desafio02B)) {
                System.out.println("trirsch... (Pega colar com a chave da amizade).\n");
                System.out.println(nomejogador + ": Togriel... Eu me vinguei meu amigo, me perdoa por não ter te salvo... \n"
                        + "eu juro que vou salvar nosso planeta e exterminar toda raça orc existente! \n");
                break;
            }
            if (i == 0 && !"b".equals(desafio02B)) {
                System.out.println("Ashork: Ora ora, eu tentei lhe avisar que seria inútil, agora morra vou lhe devorar!");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"b".equals(desafio02B)) {
                System.out.println("Ashork: Ora ora, eu tentei lhe avisar que seria inútil, agora morra vou lhe devorar!");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);
            }

        }
        return desafio02B;
    }

    public static String desafio03_A(String nomejogador) {//Função criada para o primeiro desafio, resulta ao final bom caso a escolha do jogador foi a, A Cidade dos elfos.
        String desafio03A = null;
        for (int i = 0; i < 2; i++) {
            System.out.println(nomejogador + ": Olha Togriel! a ponte que irá nos levar para a cidade dos cálculos! Falta pouco vamos!!\n"
                    + "... fuuuuum \" Flecha passando do lado da cabeça de " + nomejogador + "\n"
                    + "\n"
                    + "Gimnák: DROGA como eu errei uma flecha dessas neste pirralho?! Ei, você usou alguma magia certo?\n"
                    + "EU Gimnák NUNCA ERRO!! Seu pequeno trapaceiro, daqui você não passa! quero ver desviar o meu ataque\n"
                    + "especial! CHUVA DE FLECHAS!\n"
                    + "\n"
                    + "Você deve se desviar da habilidade de Gimnák, e atravessar a ponte para chegar até ele e derrotá-lo, para prosseguir para cidade dos cálculos.\n"
                    + "\n"
                    + "-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Gimnák usou seu ataque tempestade de flechas, esse ataque permite que ele lance 10 flechas ao ar em direção ao inimigo, a cada 3 metros Gimnák\n"
                    + "irá conjurar novamente sua habilidade tempestade de flechas, a ponte possui 11 metros e você deve se desviar de suas flechas a cada 3 metros.\n"
                    + "\n"
                    + "--------------------RESPONDA O DESAFIO---------------------\n"
                    + "Responda corretamente a seguinte questão para acertar o desvio.\n"
                    + "A função real de variável real, definida por f(x) = (3 – 2a)x + 2, é crescente quando?:\n"
                    + "\n"
                    + "(A) a = 3/2\n"
                    + "(B) a < 3/2\n"
                    + "(C) a < -3/2\n");
            System.out.println("Responda:");
            desafio03A = input.nextLine().toLowerCase();
            if ("b".equals(desafio03A)) {
                break;
            }
            if (i == 0 && !"b".equals(desafio03A)) {
                System.out.println("Gimnák: Eu disse não costumo errar, agora suas cabeças são minhas!\n");
                System.out.println("Você errou, possui somente mais uma tentativa.");

            }
            if (i == 1 && !"b".equals(desafio03A)) {
                System.out.println("Gimnák: Eu disse não costumo errar, agora suas cabeças são minhas!\n");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);
            }
        }
        return desafio03A;
    }

    public static String desafio04_A(String nomejogador) {//Funções com o final B se resulta ao final ruim, morte de Togriel. Quando o jogador seleciona ir pela opção B Cidade dos Anões.
        String desafio04A = null;
        for (int i = 0; i < 2; i++) {
           System.out.println(nomejogador + ": e Togriel: Glup! UFA! conseguimos... Mas ainda não acabou!\n"
                    + "\n"
                    + "Gimnák: Olha só, vocês têm muito talento para desviar de minhas flechas, ninguém nunca conseguiu.\n"
                    + "Irei levar a cabeça de vocês, será uma recompensa e tanto!\n"
                    + "\n"
                    + nomejogador + ": Pode esquecer essa sua ideia Orc! Vamos à luta!!\n"
                    + "Togriel: Orcs são mesmo brutos, só gostam de violência, vocês devem ser extintos! Vamos a Batalha.\n"
                    + "\n"
                    + "-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Gimnák irá usar tempestade de flechas + 2 vezes, e você deve refleti-las para derrotá-lo, pois ele não tem fraquezas com elementos.\n"
                    + "\n"
                    + "Responda corretamente a seguinte questão para refletir a habilidade de Gimnák. Ele irá utilizar novamente tempestade de flechas. Você deve\n"
                    + "refletir as flechas de volta a ele, com sua magia [Parede de Prata Elemental] utilizando o elemento correto para refletir as flechas a ele.\n"
                    + "SUA MANA ATUAL É 78, e o custo de mana dela é de 30 mana sem utilizar nenhum elemento, já com elemento tem um custo adicional e aprimoramentos para cada um deles;\n"
                    + "\n"
                    + "Nenhum elemento adicionado custo de mana 30:\n"
                    + "DEFENDE DE ATAQUES FÍSICOS BÁSICOS\n"
                    + "*O elemento de Raio custo de mana extra 7:\n"
                    + "SUGA AS ENERGIAS E QUEBRA SUAS ARMADURAS\n"
                    + "\n"
                    + "*O elemento de Fogo custo de mana extra 12:\n"
                    + "QUEIMA OS INIMIGOS CONSTANTEMENTE AO TOCAR NA PAREDE\n"
                    + "\n"
                    + "*O elemento de Gelo custo de mana extra 10:\n"
                    + "REFLETE ATAQUES OU OBJETOS FÍSICOS.\n"
                    + "\n"
                    + "--------------------RESPONDA O DESAFIO-----------------\n"
                    + "Dado o a instrução responda corretamente quantas vezes e qual elemento deve-se utilizar para derrotar Gimnák, lembrando sua mana atual é de 78.\n"
                    + "\n"
                    + "(A) Parede de Prata de Fogo 3x\n"
                    + "(B) Parede de Prata de Raio 4x\n"
                    + "(C) Parede de Prata Normal 1x\n"
                    + "(D) Parede de Prata de Gelo 2x\n"
                    + "\n");
            System.out.println("Responda:");
            desafio04A = input.nextLine().toLowerCase();
            if ("d".equals(desafio04A)) {
                System.out.println("Parabéns você derrotou Gimnák e aprendeu uma nova magia:\n"
                        + "[RAJADA DE VENTO] custo de mana 19.\n"
                        + "Esta magica pode retalhar, repelir ou empurrar inimigos.\n"
                        + "\n"
                        + nomejogador + ": e Togriel: Ufa! Ele era muito rápido, achei que iriamos morrer.\n"
                        + nomejogador + ": Vamos em frente Togriel, estamos quase lá agora iremos para o portão de entrada para cidade dos cálculos.\n"
                        + "Togriel: Certo então vamos!\n");
                break;

            }
            if (i == 0 && !"d".equals(desafio04A)) {
                System.out.println("Gimnák: Eu disse não costumo errar, agora suas cabeças são minhas!\n");
                System.out.println("Você errou, possui somente mais uma tentativa.");
            }
            if (i == 1 && !"d".equals(desafio04A)) {
                System.out.println("Gimnák: Eu disse não costumo errar, agora suas cabeças são minhas!\n");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);
            }
        }
        return desafio04A;
    }

    public static String desafio03_B(String nomejogador) {//Funções com o final B se resulta ao final ruim, morte de Togriel. Quando o jogador seleciona ir pela opção B Cidade dos Anões.
        String desafio03B = null;
        for (int i = 0; i < 2; i++) {
            System.out.println(nomejogador + ": A ponte da cidade dos cálculos... Falta pouco agora.\n"
                    + "\n"
                    + "... fuuuuum \" Flecha passando do lado da cabeça de " + nomejogador + "\n"
                    + "\n"
                    + "Gimnák: DROGA como eu errei uma flecha dessas neste pirralho?! Ei, você usou alguma magia certo?\n"
                    + "EU Gimnák NUNCA ERRO!! Seu pequeno trapaceiro, daqui você não passa! quero ver desviar o meu ataque\n"
                    + "especial! CHUVA DE FLECHAS!"
                    + "\n"
                    + "Você deve se desviar da habilidade de Gimnák, e atravessar a ponte para chegar até ele e derrotá-lo, para prosseguir para cidade dos cálculos."
                    + "\n"
                    + "-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Gimnák usou seu ataque tempestade de flechas, esse ataque permite que ele lance 10 flechas ao ar em direção ao inimigo,\n "
                    + "a cada 3 metros Gimnák irá conjurar novamente sua habilidade tempestade de flechas, a ponte possui 11 metros e \n "
                    + "você deve se desviar de suas flechas a cada 3 metros."
                    + "\n"
                    + "--------------------RESPONDA O DESAFIO---------------------"
                    + "\n"
                    + "Responda corretamente a seguinte questão para acertar o desvio.\n"
                    + "A função real de variável real, definida por f(x) = (3 – 2a)x + 2, é crescente quando:\n"
                    + "\n"
                    + "(A) a = 3/2\n"
                    + "(B) a < 3/2\n"
                    + "(C) a < -3/2\n");
            System.out.println("Responda:");
            desafio03B = input.nextLine().toLowerCase();// Aqui o jogador deve inserir uma letra A ou C para responder a questão acima.
            if ("b".equals(desafio03B)) {//Aqui diz se a resposta for igual a b ou seja se o jogador inseri a letra b e da Enter, ele passa do desafio e aparece os seguintes textos.
                break;
            }
            if (i == 0 && !"b".equals(desafio03B)) {
                System.out.println("Gimnák: Eu disse não costumo errar, agora sua cabeça é minha!");
                System.out.println("Você errou, possui somente mais uma tentativa.");
            }
            if (i == 1 && !"b".equals(desafio03B)) {
                System.out.println("Gimnák: Eu disse não costumo errar, agora sua cabeça é minha!");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);// GAME OVER o programa encerra.
            }
        }
        return desafio03B;
    }

    public static String desafio04_B(String nomejogador) {//Funções com o final B se resulta ao final ruim, morte de Togriel. Quando o jogador seleciona ir pela opção B Cidade dos Anões.
        String desafio04B = null;
        for (int i = 0; i < 2; i++) {
            System.out.println(nomejogador + ": Glup, UFA! consegui... Mas ainda não acabou!\n"
                    + "Gimnák: Olha só, você tem muito talento para desviar de minhas flechas, ninguém nunca conseguiu.\n"
                    + "Irei levar a sua cabeça, será uma recompensa e tanto!"
                    + "\n"
                    + nomejogador + ":Pode esquecer essa sua ideia Orc! Vamos à luta!!"
                    + "\n"
                    + "-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Gimnák irá usar tempestade de flechas + 2 vezes, e você deve refleti-las para derrotá-lo, pois ele não tem fraquezas com\n"
                    + "elementos. Responda corretamente a seguinte questão para refletir a habilidade de Gimnák. Ele irá utilizar novamente tempestade\n"
                    + "de flechas. Você deve refletir as flechas de volta a ele, com sua magia [Parede de Prata Elemental] utilizando o elemento\n"
                    + "correto para refletir as flechas a ele. \n"
                    + "\n"
                    + "SUA MANA ATUAL É 78, e o custo de mana dela é de 30 mana sem utilizar nenhum elemento, já com elemento tem um custo adicional e \n"
                    + " aprimoramentos para cada um deles;\n"
                    + "\n"
                    + "* Nenhum elemento adicionado custo de mana 30:\n"
                    + "DEFENDE DE ATAQUES FÍSICOS BÁSICOS\n"
                    + "\n"
                    + "*O elemento de Raio custo de mana extra 7:\n"
                    + " SUGA AS ENERGIAS E QUEBRA SUAS ARMADURAS\n"
                    + "\n"
                    + "*O elemento de Fogo custo de mana extra 12:\n"
                    + "QUEIMA OS INIMIGOS CONSTANTEMENTE AO TOCAR NA PAREDE\n"
                    + "\n"
                    + "*O elemento de Gelo custo de mana extra 10:\n"
                    + "REFLETE ATAQUES OU OBJETOS FÍSICOS.\n"
                    + "\n"
                    + "--------------------RESPONDA O DESAFIO-----------------\n"
                    + "Dado o a instrução responda corretamente quantas vezes e qual elemento deve-se utilizar para derrotar Gimnák, lembrando sua mana atual é de 78.\n"
                    + "\n"
                    + "(A) Parede de Prata de Fogo 3x\n"
                    + "(B) Parede de Prata de Raio 4x\n"
                    + "(C) Parede de Prata Normal 1x\n"
                    + "(D) Parede de Prata de Gelo 2x\n");
            System.out.println("Responda:");
            desafio04B = input.nextLine().toLowerCase();
            if ("d".equals(desafio04B)) {
                System.out.println("Parabéns você derrotou Gimnák e aprendeu uma nova magia:\n"
                        + "[RAJADA DE VENTO] custo de mana 19.\n"
                        + "Esta magica pode retalhar, repelir ou empurrar inimigos.\n"
                        + "\n"
                        + nomejogador + ": Mais um verme asqueroso morreu, eu prometo exterminar sua raça Orc!\n"
                        + "Agora falta pouco para cidade dos cálculos...\n");
                break;
            }
            if (i == 0 && !"d".equals(desafio04B)) {
                System.out.println("Gimnák: Eu disse não costumo errar, agora sua cabeça é minha!\n");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"d".equals(desafio04B)) {
                System.out.println("Gimnák: Eu disse não costumo errar, agora sua cabeça é minha!\n");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);
            }
        }
        return desafio04B;
    }

    public static String desafio05_A(String nomejogador) {//Funções com o final B se resulta ao final ruim, morte de Togriel. Quando o jogador seleciona ir pela opção B Cidade dos Anões.
        String desafio05A = null;
        for (int i = 0; i < 2; i++) {
           System.out.println(nomejogador + ": Olha Togriel, o portão que dá acesso à cidade do cálculo vamos lá!!\n"
                    + "Togriel: Ei" + nomejogador + "tem alguma coisa estranha ali, veja bem... Olha na frente do portão!\n"
                    + nomejogador + ": Oi? ahh cara isso nunca acaba, de onde surge tanto Orc? quantos tem ali 6? 9? 12? Sei lá.\n"
                    + "Togriel: Para ser exato tem 7 Orcs, mas se você reparar bem +nome+ tem dois bem altos ali, devem\n"
                    + "ser os líderes do bando.\n"
                    + "\n"
                    + "????: Ei General Skullbash, veja só 2 Elfos do outro lado do caminho, devemos matá-los? \n"
                    + "\n"
                    + "General Skullbash: Não perca tempo Buck! São apenas Elfos fracos, deixe que nossas tropas os matem, não será necessário sujar nossas mãos, continuaremos aqui guardando o portão.\n"
                    + "\n"
                    + "Togriel: Vocês se acham de mais, tem todo esse tamanho e ficam atrás de outros Orcs? Como ousa falar que nós Elfos que somos fracos? Seus dois frouxos! Fiquem ai escondidos mesmo!\n"
                    + "\n"
                    + nomejogador + "; Togriel!!! Não os irrite, quanto menos melhor para derrotá-los! \n"
                    + "\n"
                    + "Buck: O QUE FOI QUE VOCÊ DISSE ELFO INSIGNIFICANTE?!!!\n"
                    + "\n"
                    + "General Skullbash: Vocês pediram por isso, VAMOS ORCS TODOS PARA CIMA DELES JÁ!!!\n"
                    + "\n"
                    + "Orcs: SIM GENERAL, ATACAAAAAAAAAAARR!!!!!!\n"
                    + "\n"
                    + nomejogador + ": DROGA TOGRIEL!\n"
                    + "\n"
                    + "Togriel: Desculpe" + nomejogador + "...\n"
                    + "\n"
                    + nomejogador + ": Tudo bem, ei olhe a nossa direita o que é isso? uma espécie de alavanca?\n"
                    + "\n"
                    + "Togriel: Sim, aqui diz Resolva a Equação de 1º grau 3xx − 7 = 2xx + 5.\n"
                    + "Precisamos resolver logo, antes que eles nos alcance, você se lembra" + nomejogador + " ?\n"
                    + "\n"
                    + "-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "General Skullbash, Buck e + 7 Orcs, então vindo em sua direção você e Togriel,\n"
                    + "vocês devem se apressar e resolver rapidamente a equação de 1º grau [3xx − 7 = 2xx + 5].\n"
                    + "Qual o resultado final desta equação? Se acertarem, um buraco enorme irá se abrir e os\n"
                    + "levaram a uma armadilha de lava no subsolo da cidade.\n"
                    + "\n"
                    + "--------------------RESPONDA O DESAFIO---------------------\n"
                    + "Digite o resultado final da equação de 1º grau [3xx − 7 = 2xx + 5]:\n");
            System.out.println("Responda:");
            desafio05A = input.nextLine().toLowerCase();// Digitar a equação final da questão acima.
            if ("x=12".equals(desafio05A)) { // Se o jogador acertar, os seguintes texto serão apresentados.
                System.out.println(nomejogador + ": Me lembrei é x = 12!\n"
                        + "\n"
                        + "Togriel: Rápido " + nomejogador + " digite logo eles estão próximos !!\n"
                        + "\n"
                        + "clok... (Um buraco se abre)\n"
                        + "\n"
                        + "Ors: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA MALDITOOOOOOOS\n"
                        + "\n"
                        + nomejogador + ": Ótimo, vamos Togriel agora estamos no portão da cidade");
                break;
            }
            if (i == 0 && !"x=12".equals(desafio05A)) {// Se errar o seguinte texto ira aparecer.
                System.out.println("General SkullBash: HAHAHA adeus vermes insignificantes MATEM!!");
                System.out.println("Você errou, possui somente mais uma tentativa.");
            }
            if (i == 1 && !"x=12".equals(desafio05A)) {
                System.out.println("General SkullBash: HAHAHA adeus vermes insignificantes MATEM!!");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);// GAME OVER o código para de rodar
            }
        }
        return desafio05A; // dando um retorno em uma função
    }

    public static String desafio05_B(String nomejogador) {
        String desafio05B = null;
        for (int i = 0; i < 2; i++) {
           System.out.println(nomejogador + ": Vejo muitos Orcs a frente... o portão que dá acesso a cidade do cálculo está ali preciso entrar e me livrar deles...\n "
                    + "Olha só uma alavanca, aqui diz: \" Resolva a Equação de 1º grau 3𝑥𝑥 − 7 = 2𝑥𝑥 + 5. \"\n"
                    + "Droga me esqueci, bem preciso chamar a atenção deles...\n"
                    + "Já sei Lançar fogo!.\n"
                    + "\n"
                    + "Orcs: O que é isso?\n"
                    + "\n"
                    + "????: Ei General Skullbash, olha um incêndio ali naquela floresta vamos verificar o que...\n"
                    + "\n"
                    + "General Skullbash: BUCK! O mestre nos mandou tomar conta da entrada da cidade seu idiota! Não iremos sair daqui de forma alguma!\n"
                    + "\n"
                    + "Buck: Desculpe General..., Mas pode haver humanos ou elfos deliciosos para devorar...\n"
                    + "\n"
                    + nomejogador + " : SOCORRO ! NOS AJUDEM ESTAMOS MACHUCADOS EXISTEM MUITOS ORCS POR PERTO NOS AJUDEM !!\n"
                    + "\n"
                    + "General Skullbash: Dane-se o Rei vamos nos alimentar estou faminto! \n"
                    + "\n"
                    + "Buck: O QUE FOI QUE VOCÊ DISSE ELFO INSIGNIFICANTE?!!!\n"
                    + "\n"
                    + "-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "\n"
                    + "General Skullbash, Buck e + 7 Orcs, então vindo em sua direção você deve se apressar e resolver rapidamente a equação de 1º grau\n"
                    + "[3xx − 7 = 2xx + 5]. Qual o resultado final desta equação? Se acertar um buraco enorme irá se abrir que levara os Orcs a uma "
                    + "armadilha de lava no subsolo da cidade.\n"
                    + "\n"
                    + "--------------------RESPONDA O DESAFIO---------------------\n"
                    + "\n"
                    + "Digite o resultado da equação de 1º grau [3xx − 7 = 2xx + 5]:\n");
            System.out.println("Responda:");
            desafio05B = input.nextLine().toLowerCase();// Aqui o jogador deve digitar a resposta do desafio acima.
            if ("x=12".equals(desafio05B)) { // Se acerta os seguintes texto serão reproduzidos.
                System.out.println(nomejogador + ": Como pude esquecer é tão simples x = 12 !\n"
                        + "\n"
                        + "clok... (Um buraco se abre)\n"
                        + "\n"
                        + "Ors: AAAAAAAAA ELFO FEDORENTOOOOO\n"
                        + "\n"
                        + nomejogador + ": Ótimo, agora estou no portão da cidade do cálculo, só mais um pouco Togriel...\n");
                break;
            }
            if (i == 0 && !"x=12".equals(desafio05B)) {
                System.out.println("General SkullBash: HAHAHA adeus verme insignificante MATEM!!");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"x=12".equals(desafio05B)) {
                System.out.println("General SkullBash: HAHAHA adeus verme insignificante MATEM!!");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);// GAME OVER, jogador perde o jogo
            }
        }
        return desafio05B;
    }

    public static String desafio06_A(String nomejogador) {
        String desafio06A = null;

        for (int i = 0; i < 2; i++) {
            System.out.println(nomejogador + ": Veja Togriel, que portão enorme!\n"
                    + "\n"
                    + "Togriel: Sim " + nomejogador + " Enorme mesmo, como faremos para abri-lo?\n"
                    + "\n"
                    + nomejogador + ": Deve haver algum botão ou reconhecimento de voz algo do gênero.\n"
                    + "De uma olhada neste painel aí do lado.\n"
                    + "\n"
                    + "Togriel: Olha realmente, mas sem reconhecimento de voz ou botões, aqui diz\n"
                    + "\" Para entrar na idade dos cálculos, você deve digitar a fórmula delta de Bhaskara\"\n"
                    + "\n"
                    + nomejogador + ": Acho que me lembro como é, deixe-me tentar...\n"
                    + "\n"
                    + "Togriel: Cuidado " + nomejogador + " aqui diz, \" Se você errar não é digno de entrar na cidade e sera evacuado imediatamente\n"
                    + ".. O que eles querem dizer com isso?\n"
                    + "\n"
                    + nomejogador + ": Deixe-me tentar Togriel.\n"
                    + "\n"
                    + "-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Você está nos portões da Cidade do Cálculo, para abri-lo você deve digitar a fórmula Delta de Bhaskara.\n"
                    + "\n"
                    + "--------------------RESPONDA O DESAFIO---------------------\n"
                    + "Digite o a fórmula Delta de Bhaskara:");
            System.out.println("Responda:");
            desafio06A = input.nextLine().toLowerCase();// Aqui o jogador deve digitar a fórmula delta para passar o desafio
            if ("b2-4.a.c".equals(desafio06A)) {// se acerta o seguinte texto irá aparecer.
                System.out.println(nomejogador + ": Me respeite Togriel, eu lembro vagamente desta fórmula, não há por que se preocupar!\n"
                        + "Togriel: Eu também ok? Eu só estou nervoso com tudo isso que está acontecendo, e estou encantado com tudo nesta cidade veja essa tecnologia" + nomejogador + "!\n"
                        + nomejogador + ": Vamos direto para o Arranha céu dos 4 mestres do cálculos, o pergaminho deve estar lá ! Vamos Togriel você pode se divertir depois que salvarmos nosso planeta.\n"
                        + "Togriel: Certo então vamos de uma vez!\n");
                break;
            }
            if (i == 0 && !"b2-4.a.c".equals(desafio06A)) {
                System.out.println("Um buraco se abre e " + nomejogador + " e Togriel caem e cai na armadilha de lava\n");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"b2-4.a.c".equals(desafio06A)) {
                System.out.println("Um buraco se abre e " + nomejogador + " e Togriel caem e cai na armadilha de lava\n");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);// GAME OVER fecha o programa
            }
        }
        return desafio06A;
    }

    public static String desafio06_B(String nomejogador) {
        String desafio06B = null;

        for (int i = 0; i < 2; i++) {
           System.out.println(nomejogador + ": Nossa que portão enorme... impressionante mesmo essa cidade dos cálculos, Togriel iria adorar esse lugar...\n"
                    + "Olha encontrei um Painel, aqui diz \" Digite a fórmula Delta de Bhaskara para entrar na cidade, ATENÇÃO! se errar será evacuado imediatamente! \"\n"
                    + "\n"
                    + "-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "\n"
                    + "Você está nos portões da Cidade do Cálculo, para abri-lo você deve digitar a fórmula Delta de Bhaskara.\n"
                    + "\n"
                    + "--------------------RESPONDA O DESAFIO---------------------\n"
                    + "\n"
                    + "Digite o a fórmula Delta de Bhaskara:\n");
            System.out.println("Responda:");
            desafio06B = input.nextLine().toLowerCase();
            if ("b2-4.a.c".equals(desafio06B)) {// Se o jogador digitar a formula exata, os seguintes textos iram aparecer e ele irá passar de teste 
                System.out.println(nomejogador + ": Não irei mais perder tempo, vou direto para o arranha céu dos antigos 4 mestres do cálculo o pergaminho deve estar lá!\n");
                break;
            }
            if (i == 0 && !"b2-4.a.c".equals(desafio06B)) {// Caso ele erre os seguintes textos serão visualizados e o jogo deve ser resetado.
                System.out.println("Um buraco se abre e " + nomejogador + " cai em uma armadilha de lava\n");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"b2-4.a.c".equals(desafio06B)) {// Caso ele erre os seguintes textos serão visualizados e o jogo deve ser resetado.
                System.out.println("Um buraco se abre e " + nomejogador + " cai em uma armadilha de lava\n");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);// GAME OVER o programa encerra.
            }
        }
        return desafio06B;
    }

    public static String desafio07_A(String nomejogador) {
        String desafio07A = null;

        for (int i = 0; i < 2; i++) {
            System.out.println(nomejogador + " :Togriel este lugar realmente é maravilhoso, mas algo está errado, o elevador não funciona, mas tem energia estranho...\n"
                    + "\n"
                    + "Togriel: Tem razão " + nomejogador + ", estranho mesmo, vamos utilizar as escadas para subir até o salão principal e procurar pelo pergaminho.\n"
                    + "\n"
                    + nomejogador + ": Boa ideia, vamos lá...\n"
                    + "\n"
                    + "\"- Ao chegar nas escadas, +nome+ Togriel se deparam com uma espécie de parede invisível.\"\n"
                    + "\n"
                    + "Togriel: ei " + nomejogador + " há uma espécie de parede invisível.... não iremos conseguir subir, mas as escadas que levam ao subsolo estão livres, por lá iremos conseguir ir.\n"
                    + "\n"
                    + nomejogador + ": então vamos Togriel, melhor não perder tempo, aliás sua percepção permanece impecável parabéns.\n"
                    + "\n"
                    + "Togriel: Obrigado " + nomejogador + " quanta generosidade, mas deixemos isso para depois, vamos.\n"
                    + "\n"
                    + "\"- Chegando ao subsolo do arranha céu dos antigos mestres do cálculo, " + nomejogador + " e Togriel se deparam com uma prisão,\n"
                    + " e lá encontram vários humanos, elfos e anões, especialmente os Thönir e Mjönir, os lendários engenheiro/ferreiro e "
                    + "atualmente os 2 novos mestres do cálculo presos.\n"
                    + "\n"
                    + "Togriel: " + nomejogador + " olha quantas pessoas presas e parecem que todos estão sobre aquela parede invisível, "
                    + "mas que raio de magia é essa? Orc usando magia? A coisa ta feia +nome+, precisamos salvá-los! \n"
                    + "\n"
                    + nomejogador + ": Eu concordo, mas não sabemos derrubar esta suposta parede invisível. Mas veja! Ei Togriel veja é Thönir e Mjönir!"
                    + "Temos que ajudá-lo\n"
                    + "Togriel: Eiiii Thönir e Mjönir!\n"
                    + "\n"
                    + "Thönir e Mjönir: ...!!! ...!!! ...!!! ...\n"
                    + "\n"
                    + nomejogador + ": ???? o que querem dizer? Estão mudos? ACONTECEU ALGO ??\n"
                    + "\n"
                    + "Togriel: " + nomejogador + " aqui diz, está cela está protegida por um cálculo avançado, "
                    + "é necessário que vocês digitem corretamente o cálculo, só assim então iremos libertar os prisioneiros.\n"
                    + "\n"
                    + nomejogador + ": Sim Togriel! E o que mais diz ai? Que cálculo é este? !!!\n"
                    + "\n"
                    + "Togriel: Para abrir a cela, digite, qual a estrutura da função de 2º grau? \n"
                    + "Ah essa eu lembro que ax é ao quadrado, mas esta máquina não aceita caracteres especiais... \nAh então deve se pôr só o número 2 ao invés de pôr ao quadrado, mas o restante me esqueci, me ajuda ai +nome+ !\n"
                    + "\n"
                    + "-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Você deve digitar a estrutura da função de 2ºgrau, Togriel te deu uma dica de que ax tem que ser elevado ao quadrado.\n"
                    + "\n"
                    + "--------------------RESPONDA O DESAFIO--------------------\n"
                    + "Digite a estrutura da função de 2ºgrau:\n");
            System.out.println("Responda:");
            desafio07A = input.nextLine().toLowerCase();
            if ("f(x)=ax2+bx+c".equals(desafio07A)) {// deve ser digitado a seguinte formula a esquerda para passar o desafio, se passar os seguintes textos são apresentados.
                System.out.println(nomejogador + ": Isso, lembrei, digite Togriel f(x)=ax²+bx+c\n"
                        + "\n"
                        + "Togriel: Ok!\n"
                        + "\n"
                        + "\" - digitando...  Claaaank ! O painel da cela ficou verde, os anões Thönir e Mjönir, estão livres! \"\n"
                        + "\n"
                        + nomejogador + ": Conseguimos Togriel ! Resgatamos ao menos os anões mais importantes de nosso planeta! Mas até agora não manifestaram um obrigado! Ou qualquer palavra será que está tudo bem com eles?\n"
                        + "\n"
                        + "\" - Thonir e Mjönir faze mímicas e sinais com as mãos, os mesmos solicitam uma caneta e papel para escreverem. \"\n"
                        + "\n"
                        + "Togriel: Eles precisam de um papel e caneta +nome+ ! Empreste nossos cadernos de anotações e os deixei utilizar a caneta digital!\n"
                        + "\n"
                        + "Mjönir escreveu: Estamos sobre um encanto de um mago Orc chamado Major Orzash, um mago de alta força e usa encantos para amaldiçoar\n"
                        + "todos os tipos de formas de vida e objetos. Eles nos amaldiçoaram com a magia de [SILENCIAR] esta magia nos impede de usar quaisquer\n"
                        + "palavras ou magias encantos, fomos surpreendidos por esse mago e um outro Orc enorme, acho que era o Rei deles, não tivemos chances, \n"
                        + "desde que não conseguimos encontrar os outros 2 mestres do cálculo nossas forças não são as mesmas, e a cidade corre riscos,\n"
                        + "precisamos quebrar o encanto e ir atrás do pergaminho, pois o Major Orzash foi atrás dele e está no 21º andar, para quebrar\n"
                        + "este encanto é necessário que um mago diga em alto som na língua dos Orcs \"CIYEMSE AYY AMÕE'S.\" Que significa SILENCIE TODOS\n"
                        + " OS ANÕES. Por isso nem um de nós anões podemos falar, estudamos um pouco da língua Orc, e por isso eles nos silenciou, pois\n"
                        + "poderíamos desfazer os encantos conjurados.\n"
                        + "\n"
                        + nomejogador + ": Certo vamos tentar, \"SIYIMSE AYY ANÕES\" !\n"
                        + "\n"
                        + "Togriel: não é assim! Vamos falar bem alto juntos +nome+!\n"
                        + "1. 2.. 3 AGORA\n"
                        + "\n"
                        + nomejogador + ": e Togriel: CIYEMSE AYY AMÕE'S !!!!\n"
                        + "\n"
                        + "\"- Algo maligno parece desaparecer dos anões e o encanto é desfeito.\"\n"
                        + "\n"
                        + "Thönir e Mjönir: Eles são ótimos! Bom em cálculos e aprende outras linguagens rapidamente! Podem ser os dois outros mestres dos cálculos que precisamos.\n"
                        + "Bem resolvemos isso depois, vamos para a biblioteca rápido!\n"
                        + "\n"
                        + "\"- " + nomejogador + " e Togriel parecem bem felizes.\": Não irei mais perder tempo, vou direto para o arranha céu dos antigos 4 mestres do cálculo o pergaminho deve estar lá!\n");
                break;
            }
            if (i == 0 && !"f(x)=ax2+bx+c".equals(desafio07A)) {// Se errar os seguintes textos são apresentados e reinicia 
                System.out.println("Um mecanismo de defesa de parede de espinhos esmaga " + nomejogador + " Togriel.\n");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"f(x)=ax2+bx+c".equals(desafio07A)) {// Se errar os seguintes textos são apresentados e o jogo termina.
                System.out.println("Um mecanismo de defesa de parede de espinhos esmaga " + nomejogador + " Togriel.\n");
                System.out.println("Você perdeu o jogo!");
                System.exit(0); // GAME OVER
            }
        }
        return desafio07A;
    }

    public static String desafio07_B(String nomejogador) {
        String desafio07B = null;
        for (int i = 0; i < 2; i++) {
           System.out.println(nomejogador + ":Não consigo usar este elevador, parece estar travado por algo estranho, pois energia tem, bem irei utilizar as escadas.\n"
                    + "\"- chegando nas escadas +nome+ percebe que há uma parede invisível impedindo o avanço dele. \"\n"
                    + "\n"
                    + nomejogador + " : Droga, não consigo passar daqui... Só me resta descer ao subsolo, talvez encontre algo útil.\n"
                    + "\n"
                    + "Chegando ao subsolo do arranha céu dos antigos mestres do cálculo, " + nomejogador + " se depara com uma prisão, e lá encontram vários humanos, elfos e anões,\n "
                    + "especialmente os Thönir e Mjönir, os lendários engenheiro/ferreiro e atualmente os 2 novos mestres do cálculo presos.\n"
                    + nomejogador + ": olha quantas pessoas presas e parecem que todos estão sobre aquela parede invisível, Orcs nojentos, devem ser extintos! preciso salvá-los! \n"
                    + nomejogador + ": Eu concordo, mas não sabemos derrubar esta suposta parede invisível. Mas veja! Ei Togriel veja é Thönir e Mjönir! Temos que ajudá-lo\n"
                    + nomejogador + ": Ei Thönir e Mjönir!\n"
                    + "\n"
                    + "Thönir e Mjönir: ...!!! .... !!! ...!!!...\n"
                    + "\n"
                    + nomejogador + ": ???? o que querem dizer? Estão mudos? ACONTECEU ALGO ??\n"
                    + "\n"
                    + nomejogador + ": Aqui diz, está cela está protegida por um cálculo avançado, é necessário que digite corretamente o cálculo,\n"
                    + "só assim então iremos libertar os anões lendários. Vamos ao desafio...\n"
                    + "\n"
                    + "-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Você deve digitar a estrutura da função de 2ºgrau.\n"
                    + "--------------------RESPONDA O DESAFIO--------------------\n"
                    + "Digite a estrutura da função de 2ºgrau:\n"
                    + "\n");
            System.out.println("Responda:");
            desafio07B = input.nextLine().toLowerCase();
            if ("f(x)=ax2+bx+c".equals(desafio07B)) {// É necessario digitar a formula dentro do código para passar desta fase, acertando a questão os seguintes textos aparecem.
                System.out.println("andar, para quebrar este encanto é necessário que um mago diga em alto som na linguá dos Orcs\n"
                        + " – digitando... Claaaank ! O painel da cela ficou verde, os anões Thönir e Mjönir, estão livres!\n "
                        + "\n"
                        + nomejogador + ": Consegui! Resgatei ao menos os anões mais importantes de nosso planeta! Mas até agora não falaram nada....\n"
                        + " - Thonir e Mjönir fazem mímicas e sinais com as mãos, os mesmo solicitam uma caneta e papel para escreverem.\n"
                        + "\n"
                        + nomejogador + ": Parecem querer um papel e caneta, tomem usei minha caneta e tela digital.\n"
                        + "\n"
                        + "-Mjönir escreveu: Estamos sobre um encanto de um mago Orc chamado Major Orzash, um mago de alta força e usa encantos para\n"
                        + "amaldiçoar todos os tipos de formas de vida e objetos. Eles nos amaldiçoaram com a magia de [SILENCIAR] esta magia nos impede de\n"
                        + "usar quaisquer palavras ou magias encantos, fomos surpreendidos por esse mago e um outro Orc enorme, acho que era o Rei deles,\n"
                        + "não tivemos chances, desde que não conseguimos encontrar os outros 2 últimos mestres do cálculo nossas forças não são as mesmas,\n"
                        + "e a cidade corre riscos, precisamos quebrar o encanto e ir atrás do pergaminho, pois o Major Orzash foi atrás dele e está no 21º\n"
                        + "[CIYEMSE AYY AMÕE'S]. Que significa SILENCIE TODOS OS ANÕES. Por isso nem um de nós anões podemos falar, estudamos um pouco da língua\n"
                        + "Orc, e por isso eles nos silenciou, pois poderíamos desfazer os encantos conjurados.\n"
                        + "\n"
                        + nomejogador + ": Certo CIYIMSE AYY AMÕE'S!!!! \n"
                        + "\n"
                        + "- Algo maligno parece desaparecer dos anões e o encanto é desfeito.\n"
                        + "\n"
                        + "Thönir e Mjönir: Ele é muito bom, foi eficiente em cálculos e aprende outras linguagens rapidamente! Pode ser nosso 3º mestre\n"
                        + "do cálculo que precisamos. Bem resolvemos isso depois, vamos para a biblioteca rápido!\n");
                break;
            }
            if (i == 0 && !"f(x)=ax2+bx+c".equals(desafio07B)) {//Se errar os seguintes textos aparecem o o jogador perde o jogo e tem que reiniciar.
                System.out.println("Um mecanismo de defesa de parede de espinhos esmaga " + nomejogador + ".\n");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"f(x)=ax2+bx+c".equals(desafio07B)) {//Se errar os seguintes textos aparecem o o jogador perde o jogo e tem que reiniciar.
                System.out.println("Um mecanismo de defesa de parede de espinhos esmaga " + nomejogador + ".\n");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);// GAME OVER o programa encerra.
            }
        }
        return desafio07B;
    }

    public static String desafio08_A(String nomejogador) {
        String desafio08A = null;

        for (int i = 0; i < 2; i++) {
            System.out.println(nomejogador + " :Vejam anões está é a barreira que nos impede de passar.\n"
                    + "\n"
                    + "Thönir: Sem problema posso me livrar dela rapidamente, se me permitem.\n"
                    + "!!!HAYY QECASVITE!!! (Desativar parede)\n"
                    + "\n"
                    + "Togriel: Uau! Eles são incríveis!\n"
                    + "\n"
                    + "\"- O elevador começa a subir para o 21ºandar e os anões dizem que o local onde o pergaminho se encontra\n"
                    + "(em uma passagem secreta no setor de linguagens estrangeiras), ao chegar na biblioteca " + nomejogador + " Togriel\n"
                    + "e os anões se deparam com Major Orzash.\n"
                    + "\n"
                    + "Thönir e Mjönir: É ele o Orc mago que nos amaldiçoo, e veja só o maldito conseguiu encontrar o pergaminho "
                    + "mesmo! Daqui você não sai de jeito nenhum seu ladrão!\n"
                    + "\n"
                    + nomejogador + ": Nossa, ele é um dos grandes, veja só o pergaminho está nas mãos dele, ei Togriel vamos ter de tirar o pergaminho dele antes de qualquer coisa!\n"
                    + "\n"
                    + "Togriel: Eu tive uma ideia, " + nomejogador + " você pode utilizar sua parede de prata para aprisionar ele, Thönir e Mjönir os distraem e eu pego o pergaminho!\n"
                    + "\n"
                    + nomejogador + ":, Thönir e Mjönir: Boa ideia !!\n"
                    + "\n"
                    + "Major Orzash: Já acabaram criaturas inferiores? Eu já estou com o pergaminho e de minha mão não saíra e vou levá-lo ao nosso Rei o grande Hellguz e\n"
                    + "nada irá me impedir, então já que não iram sair da minha frente...\n"
                    + "[Lançar Relâmpagos!]. \n"
                    + "\n"
                    + nomejogador + ": [Parede de Prata de Gelo!] \n"
                    + "\n"
                    + "\"- Os relâmpagos de Major Orzash são refletidos a ele e uma barreira o protege\"\n"
                    + "\n"
                    + "Major Orzash: Maldito! você é um mago ? Hump bem natural de um Elfozinho medíocre! Já que é assim irei silenciá-lo! \n"
                    + "[CIYEMSE AYY EYLUC !!] \n"
                    + "\n"
                    + nomejogador + ": Oras parece que não funcionou, não é? HAHAHAHA\n"
                    + "\n"
                    + "Togriel: ...!!...!!!!...!!\n"
                    + "\n"
                    + "Major Orzash: Como um ficou silenciado e o outro não?! Não é possível minha maldição falhou? Não ou talvez esse rapaz seja um meio....\n"
                    + "\n"
                    + "Thönir e Mjönir: Ei " + nomejogador + " Acerte as costas dele para desativar o escudo, e depois o finalizamos!\n"
                    + "\n"
                    + nomejogador + ": Certo eu tive uma ideia Mjönir cause um pequeno terremoto com sua marreta!\n"
                    + "\n"
                    + "Mjönir: [TERREMOTO!] \n"
                    + "\n"
                    + "\"- Major Orzash se desequilibra e seu escudo desaparece\"\n"
                    + "\n"
                    + "Mjönir: Agora!\n"
                    + "\n"
                    + "-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Para surpreendê-lo pelas costas é necessário executar um movimento denominado matematicamente como Parábola, desta forma responda:\n"
                    + "\n"
                    + "-------------------RESPONDA DESAFIO------------------------\n"
                    + "Quais as coordenadas do vértice de uma parábola determinada pela função: y = x2 + x – 6?\n"
                    + "\n"
                    + "A) – 0,5 e – 6,25\n"
                    + "B) 1 e 6\n"
                    + "C) 2 e 9\n"
                    + "\n");
            System.out.println("Responda:");
            desafio08A = input.nextLine().toLowerCase();
            if ("a".equals(desafio08A)) {// O jogador deve selecionar a opção à para conseguir passar do teste, este código faz com que se ele digitar a, ele irá acerta a questão.
                System.out.println(nomejogador + ": [Rajada de vento!] \n"
                        + "\n"
                        + "\"-Major Orzash está vulnerável e o pergaminho não está mais em suas mãos Togriel conseguiu pegá-lo\"\n"
                        + "\n"
                        + "Thönir: Finalize ele agora " + nomejogador + " Togriel pegou o pergaminho!");
                break;
            }
            if (i == 0 && !"a".equals(desafio08A)) {// Este código se ele errar, os seguintes textos aparecem e reinicia.
                System.out.println("Major Orzash: FUAHA HA HA AHA HA que elfo patético, MORRA! RELAMPAGOS INFERNAIS!!!\n");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"a".equals(desafio08A)) {// Este código já diz o contrário se ele errar, os seguintes textos aparecem e é fim de jogo.
                System.out.println("Major Orzash: FUAHA HA HA AHA HA que elfo patético, MORRA! RELAMPAGOS INFERNAIS!!!\n");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);// GAME OVER o programa fecha
            }
        }
        return desafio08A;
    }

    public static String desafio09_A(String nomejogador) {
        String desafio09A = null;
        for (int i = 0; i < 2; i++) {
            System.out.println("-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Agora para finalizá-lo com a sequência correta para conjurar [Parede de Prata de Fogo], responda: Em relação à progressão aritmética\n"
                    + "(10, 17, 24, …), determine, qual o seu 15° termo?\n"
                    + "Considere: an = 10 + (n – 1). 7\n"
                    + "-------------------RESPONDA DESAFIO------------------------\n"
                    + "A) 90\n"
                    + "B) 108\n"
                    + "C) 105\n"
                    + "\n");
            System.out.println("Responda:");
            desafio09A = input.nextLine().toLowerCase();
            if ("b".equals(desafio09A)) { // Se acertar inserindo a letra b o jogador passa de fase.
                System.out.println(" Major Orzash em chamas: AAAAAARRR, não acredito que perdi para esses fracassados! \n"
                        + "Thönir e Mjönir: Desapareça criatura detestável!\n"
                        + " -Major Orzash é desintegrado e desaparece\n"
                        + "Togriel: Você CONSEGUIU " + nomejogador + " UHUUUU, a minha voz voltou!\n"
                        + "Thönir: Não só a sua, todos que foram amaldiçoados por eles estão livres agora, parabéns vocês são heróis!\n"
                        + nomejogador + ": Ainda não acabou, não comemorem, o meteoro está vindo precisamos ir até a sala principal e pegar o cartão \n"
                        + "de acesso para a sala do topo do Arranha céu!\n"
                        + "Mjönir: tem razão vamos!\n");
                break;
            }
            if (i == 0 && !"b".equals(desafio09A)) {// Se errar este código faz apresentar os seguintes textos e é fim de jogo
                System.out.println("Major Orzash: Você me irritou pequeno elfo, agora morra [CHAMAS DO DESESPERO!]\n");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"b".equals(desafio09A)) {// Se errar este código faz apresentar os seguintes textos e é fim de jogo
                System.out.println("Major Orzash: Você me irritou pequeno elfo, agora morra [CHAMAS DO DESESPERO!]\n");
                System.out.println("Você perdeu o jogo!\n");
                System.exit(0);//GAME OVER este código encerra o programa.
            }
        }
        return desafio09A;
    }

    public static String desafio08_B(String nomejogador) {
        String desafio08B = null;

        for (int i = 0; i < 2; i++) {
           System.out.println(nomejogador + ": Vejam anões está é a barreira que me impede de passar.\n"
                    + "\n"
                    + "Thönir: Sem problema posso me livrar dela rapidamente, se me permite.\n"
                    + "!!!HAYY QECASVITE!!! (Desativar parede)\n"
                    + "\n"
                    + "\"- O elevador começa a subir para o 21º andar, e os anões dizem que o local onde o pergaminho se encontra\n"
                    + "(em uma passagem secreta no setor de linguagens estrangeiras), ao chegar na biblioteca +nome+ e os anões se deparam com\n"
                    + "Major Orzash.\n"
                    + "\n"
                    + "Thönir e Mjönir: É ele o Orc mago que nos amaldiçoo, e veja só o maldito conseguiu encontrar o pergaminho mesmo! Daqui você não sai de jeito nenhum seu ladrão!\n"
                    + "\n"
                    + nomejogador + ":Nossa, ele é um dos grandes, veja só o pergaminho está nas mãos dele, Mjönir vamos ter de tirar o pergaminho dele antes de qualquer coisa!\n"
                    + "\n"
                    + "Mjönirl: Eu tive uma ideia, " + nomejogador + " você pode utilizar suas magias para derrotar ele, Thönir o distrai e eu pego o pergaminho!\n"
                    + "\n"
                    + nomejogador + ":Thönir e Mjönir: Boa ideia !!\n"
                    + "\n"
                    + "Major Orzash: Já acabaram criaturas inferiores? Eu já estou com o pergaminho e de minha mão não saíra e vou levá-lo ao nosso Rei o grande Hellguz "
                    + "e nada irá me impedir, então já que não iram sair da minha frente... [Lançar Relâmpagos!]. \n"
                    + "\n"
                    + nomejogador + ": [Parede de Prata de Gelo!] \n"
                    + "\n"
                    + "\"- Os relâmpagos de Major Orzash são refletidos a ele e uma barreira o protege\"\n"
                    + "\n"
                    + "Major Orzash: Maldito! você é um mago? Hump bem natural de um Elfozinho medíocre! Já que é assim irei silenciá-lo! \n"
                    + "[CIYEMSE AYY EYLUC !!]\n"
                    + "\n"
                    + nomejogador + ": Horas parece que não funcionou, não é? HAHAHAHA\n"
                    + "\n"
                    + "Major Orzash: Como não fico silenciado?! Não é possível minha maldição falhou? Não ou talvez esse rapaz seja um meio....\n"
                    + "\n"
                    + "Thönir e Mjönir: Ei " + nomejogador + " Acerte as costas dele para desativar o escudo, e depois o finalizamos!\n"
                    + "\n"
                    + nomejogador + ": Certo eu tive uma ideia Mjönir cause um pequeno terremoto com sua marreta!\n"
                    + "\n"
                    + "Mjönir: [TERREMOTO!] \n"
                    + "\n"
                    + "\"- Major Orzash se desequilibra e seu escudo desaparece\"\n"
                    + "\n"
                    + "Mjönir: Agora!\n"
                    + "\n"
                    + "-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Para surpreendê-lo pelas costas é necessário executar um movimento denominado matematicamente como Parábola,"
                    + "desta forma responda:\n"
                    + "-------------------RESPONDA DESAFIO------------------------\n"
                    + "Quais as coordenadas do vértice de uma parábola determinada pela função: y = x2 + x – 6?"
                    + "\n"
                    + "A) – 0,5 e – 6,25\n"
                    + "B) 1 e 6\n"
                    + "C) 2 e 9\n");
            System.out.println("Responda:");
            desafio08B = input.nextLine().toLowerCase();
            if ("a".equals(desafio08B)) {
                System.out.println(nomejogador + ": [Rajada de vento !]\n"
                        + "-Major Orzash está vulnerável e o pergaminho não está mais em suas mãos Mjönir conseguiu pega-lo\n"
                        + "Thönir: Finalize ele agora " + nomejogador + " Mjönir pegou o pergaminho!\n");
                break;
            }
            if (i == 0 && !"a".equals(desafio08B)) {
                System.out.println("Major Orzash: FUAHA HA HA AHA HA que elfo patético, MORRA! RELAMPAGOS INFERNAIS!!!\n");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"a".equals(desafio08B)) {
                System.out.println("Major Orzash: FUAHA HA HA AHA HA que elfo patético, MORRA! RELAMPAGOS INFERNAIS!!!\n");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);
            }
        }
        return desafio08B;
    }

    public static String desafio09_B(String nomejogador) {
        String desafio09B = null;

        for (int i = 0; i < 2; i++) {
            System.out.println("-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Agora para finalizá-lo com a sequência correta para conjurar [Parede de Prata de Fogo], responda: Em relação à progressão aritmética\n"
                    + "(10, 17, 24, …), determine, qual o seu 15° termo?\n"
                    + "Considere: an = 10 + (n – 1). 7\n"
                    + "-------------------RESPONDA DESAFIO------------------------\n"
                    + "A) 90\n"
                    + "B) 108\n"
                    + "C) 105\n"
                    + "\n");
            System.out.println("Responda:");
            desafio09B = input.nextLine().toLowerCase();
            if ("a".equals(desafio09B)) {
                System.out.println(" Major Orzash em chamas: AAAAAARRR, não acredito que perdi para esses fracassados! \n"
                        + "Thönir e Mjönir: Desapareça criatura detestável!\n"
                        + " -Major Orzash é desintegrado e desaparece\n"
                        + "Thönir: Conseguimos, todos os que foram amaldiçoados por ele estão livres agora, muito bom rapaz você é um herói\n"
                        + nomejogador + ": Obrigado, mas ainda não acabou, não comemorem, o meteoro está vindo precisamos ir até a sala principal e pegar o cartão \n"
                        + "de acesso para a sala do topo do Arranha céu!\n"
                        + "Mjönir: tem razão vamos!\n");
                break;
            }
            if (i == 0 && !"a".equals(desafio09B)) {
                System.out.println("Major Orzash: Você me irritou pequeno elfo, agora morra [CHAMAS DO DESESPERO!]\n");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"a".equals(desafio09B)) {
                System.out.println("Major Orzash: Você me irritou pequeno elfo, agora morra [CHAMAS DO DESESPERO!]\n");
                System.out.println("Você perdeu o jogo!\n");
                System.exit(0);
            }
        }
        return desafio09B;
    }

    public static String desafio10_A(String nomejogador) {
        String desafio10A = null;

        for (int i = 0; i < 2; i++) {
            System.out.println(nomejogador + ": Chegamos aqui é o salão principal, procurem pelo cartão de acesso!\n"
                    + "\n"
                    + "Thönir: Oras! Ele ficava aqui em nossa mesa não está mais! Será que alguém está tentando destruir ou usar a máquina?! Devemos nos apressar !!!\n"
                    + "\n"
                    + "\" - Ao chegar na sala da máquina o último andar do arranha céu, " + nomejogador + ", Togriel e os anões se deparam com o Grande LITERALMENTE Grande Rei Hellguz.\"\n"
                    + "\n"
                    + nomejogador + ": QUE ORC ENORME !!!\n"
                    + "\n"
                    + "Togriel: Sim! Ele é enorme +nome+, mas espera um segundo ai, ele tem uma cor diferente dos outros!\n"
                    + "\n"
                    + "Mjönir: Eu não acredito... Isso... isso... isso é!\n"
                    + "\n"
                    + "Thönir: UM ORC DEMONÍACO!!?\n"
                    + "\n"
                    + nomejogador + " e Togriel: O que é um Orc Demoníaco!!?? Pare de nos assustar Thönir!\n"
                    + "\n"
                    + "Mjönir: O lendário Orc demoníaco! Ele tem a capacidade de invocar\n"
                    + "almas de vidas que ele já tirou ou as que já serviram a ele. Para alcançar essa aparência horrível é necessário matar bilhões de vidas!\n"
                    + "\n"
                    + "Rei Hellguz: ora ora... Veja só se os anões não são mesmo inteligentes hump, eu apenas direi uma vez, me entreguem o pergaminho ou irei\n"
                    + "matá-los sem piedade, se me entregarem posso pensar em poupar a vida de seu ridículo planeta.\n"
                    + "\n"
                    + nomejogador + ": Isso já mais irá acontecer! Nós iremos dá um fim nisso, você pode ser o mais medonho que for, mas isso não irá nos impedir de lutar com você!\n"
                    + "\n"
                    + "Rei Hellguz: É sempre a mesma coisa, não tem mesmo amor a vida de vocês não é mesmo? HAHHAHAA já que é assim irei matá-los usando meu poder\n"
                    + "imensurável [IMTUSAX AYNA QENUMIASA]\n"
                    + "\n"
                    + "Togriel: O O.. o que ele disse Mjönir??? Thöni? Alguém por favor estou com medo\n"
                    + "\n"
                    + "Mjönir: ... Preparem-se ele está invocando almas para lutar por ele\n"
                    + "\n"
                    + nomejogador + ": Covarde! Lute por si mesmo!\n"
                    + "\n"
                    + "Rei Hellguz: ....\n"
                    + "\n"
                    + "\" - Rei Hellguz invoca almas perdidas de Orcs que já derrotou para lutar com vocês \"\n"
                    + "\n"
                    + "Rei Hellguz: [TEMWA HURTZDAN!]\n"
                    + "\n"
                    + "\"- Hurtzdan apareceu e você deve derrotá-lo\"\n"
                    + "-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Lista de dano, Magias e Mana gasta\n"
                    + "Fogo 7 de dano e gasta 11 de mana por canalização\n"
                    + "Gelo 5 de dano e gasta 9 de mana por canalização\n"
                    + "Raio 9+2(BÔNUS) de dano e gasta 7 de mana.\n"
                    + "-------------------RESPONDA DESAFIO------------------------\n"
                    + "Com base a seus 28 pontos de mana, qual das alternativas está correta? para derrotar Hurtzdan?\n"
                    + "(A)Lançar Raio 4x\n"
                    + "(B)Lançar Fogo 3x\n"
                    + "(C)Lançar Gelo 5x\n");
            System.out.println("Responda:");
            desafio10A = input.nextLine().toLowerCase();
            if ("a".equals(desafio10A)) {// Este código defini se o jogador colocar a letra a ele irá passar para o proximo monstro que o chefe irá invocar.
                System.out.println("Rei Hellguz: Hurtzdan sempre foi imprestável mesmo!\n"
                        + "\n"
                        + "Rei Hellguz: [TEMWA Arshork!]");
                break;
            }
            if (i == 0 && !"a".equals(desafio10A)) {//Se errar as questões este código faz com que esses textos apareçam.
                System.out.println("Rei Hellguz: FUAHAHAHAHA ! Eu avisei, agora desapareçam! [DIMENSÃO INFERNAL]\n");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"a".equals(desafio10A)) {//Se errar as questões este código faz com que esses textos apareçam.
                System.out.println("Rei Hellguz: FUAHAHAHAHA ! Eu avisei, agora desapareçam! [DIMENSÃO INFERNAL]\n");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);//GAME OVER, seguido deste código que termina o jogo.
            }
        }
        return desafio10A;
    }

    public static String desafio10_B(String nomejogador) {
        String desafio10B = null;
        for (int i = 0; i < 2; i++) {
            System.out.println("-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Ashork possui uma armadura de prata de 55kg, ataques físicos magias de gelo e raio são inúteis, então resta utilizar sua magia de fogo,\n"
                    + "você precisa fundir a armadura de prata de Ashork e derrete-la junto com a armadura, para isso utilize a sua magia de fogo,\n"
                    + "lembrando sua mana atual é 48 e você não pode zerá-la. Quanto mais você lançar um magia de fogo menor o custo de mana,\n"
                    + " mas também menor a temperatura alcançada. Se para cada 1kg de prata é necessário 960 ºC, quantos graus Celsius, \n"
                    + "são necessários para fundir 55kg de prata?\n"
                    + "\n"
                    + "--------------------RESPONDA O DESAFIO-----------------\n"
                    + "(A) lançar fogo 5x 9.740 ºC mana gasta 11|\n"
                    + "(B) lançar fogo 2x 26.400 ºC mana gasta 29|\n"
                    + "(C) lançar fogo 6x 16.820ºC mana gasta 12|\n");
            System.out.println("Responda:");
            desafio10B = input.nextLine().toLowerCase();
            if ("b".equals(desafio10B)) {
                System.out.println("Rei Hellguz: JÁ CHEGA! IREI DESTRUIR VOCÊS COM MINHAS PRÓPRIAS MÃOS!\n");
                break;
            }
            if (i == 0 && !"b".equals(desafio10B)) {
                System.out.println("Rei Hellguz: FUAHAHAHAHA ! Eu avisei, agora desapareçam! [DIMENSÃO INFERNAL]\n");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"b".equals(desafio10B)) {
                System.out.println("Rei Hellguz: FUAHAHAHAHA ! Eu avisei, agora desapareçam! [DIMENSÃO INFERNAL]\n");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);//GAME OVER, seguido deste código que termina o jogo.
            }
        }
        return desafio10B;
    }

    public static String desafioFinal_A(String nomejogador) {
        String desafioFinalA = null;

        System.out.println("----------------------QUESTÃO DESAFIO FINAL--------------------------\n"
                + "Parabéns você chegou ao desafio final!!!\n"
                + "Para evitar a destruição do planeta e derrotar o Rei Hellguz responda corretamente:\n"
                + "Em uma PG (progressão geométrica) decrescente, são conhecidos dois termos: a5 = 135 e a8 = 5. Determine qual é o primeiro termo dessa PG?\n"
                + "Considere: an = a1 · qn – 1\n"
                + "--------------------RESPONDA O DESAFIO-----------------\n"
                + "A) a1 = 10.935.\n"
                + "B) a1 = 9.500\n"
                + "C) a1 = 10.200\n");

        desafioFinalA = input.nextLine().toLowerCase();
        if ("a".equals(desafioFinalA)) {
            System.out.println("Rei Hellguz: COMO PUDE SER DERROTADO POR SERES TÃO INSIGNIFICANTES ?!!\n"
                    + "\n"
                    + nomejogador + ": Pague por tudo que você fez Orc maldito, agora vá para o seu verdadeiro lugar, o inferno!\n"
                    + "\n"
                    + "Togriel: É isso aí! E...e... E NUNCA MAIS MEXA COM OS ELFOS!\n"
                    + "\n"
                    + "Rei Hellguz: NÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        } else {
            System.out.println("Rei Hellguz: VOCÊS ME IRRITARAM AGORA DESAPAREÇAM!! [TERROR INFERNAL SUPREMO]\n");
            System.out.println("Você perdeu o jogo!");
            System.exit(0);//GAME OVER, seguido deste código que termina o jogo.
        }
        return desafioFinalA;
    }

    public static String desafio10_C(String nomejogador) {
        String desafio10C = null;

        for (int i = 0; i < 2; i++) {
           System.out.println(nomejogador + ": Chegamos aqui é o salão principal, procurem pelo cartão de acesso!\n"
                    + "\n"
                    + "Thönir: Oras! Ele ficava aqui em nossa mesa não está mais! Será que alguém está tentando destruir ou usar a máquina?! Devemos nos apressar !!!\n"
                    + "\n"
                    + "\" - Ao chegar na sala da máquina o último andar do arranha céu, " + nomejogador + " e os anões se deparam com o LITERALMENTE Grande Rei Hellguz.\"\n"
                    + "\n"
                    + nomejogador + ": QUE ORC ENORME !!!\n"
                    + "\n"
                    + "Mjönir: Eu não acredito... Isso... isso... isso é!\n"
                    + "\n"
                    + "Thönir: UM ORC DEMONÍACO!?\n"
                    + "\n"
                    + nomejogador + " : O que é um Orc Demoníaco!!?? Thönir!\n"
                    + "\n"
                    + "Mjönir: O lendário Orc demoníaco! Ele tem a capacidade de invocar\n"
                    + "almas de vidas que ele já tirou ou as que já serviram a ele. Para alcançar essa aparência horrível é necessário matar bilhões de vidas!\n"
                    + "\n"
                    + "Rei Hellguz: ora ora... Veja só se os anões não são mesmo inteligentes hump, eu apenas direi uma vez, me entreguem o pergaminho ou irei matá-los sem piedade, se me entregarem posso pensar em poupar a vida de seu ridículo planeta.\n"
                    + "\n"
                    + nomejogador + " : Isso já mais irá acontecer! Nós iremos dar um fim nisso, você pode ser o mais medonho que for, mas isso não irá nos impedir de lutar com você!\n"
                    + "\n"
                    + "Rei Hellguz: É sempre a mesma coisa, não tem mesmo amor a vida de vocês não é mesmo? HAHHAHAA já que é assim irei mata-los usando meu poder imensurável [IMTUSAX AYNA QENUMIASA]\n"
                    + "\n"
                    + "Mjönir: ... Preparem-se ele está invocando almas para lutar por ele\n"
                    + "\n"
                    + nomejogador + " : Covarde! Lute por si mesmo! \n"
                    + "\n"
                    + "Rei Hellguz: ....\n"
                    + "\" - Rei Hellguz invoca almas perdidas de Orcs que já derrotou para lutar com vocês \"\n"
                    + "\n"
                    + "Rei Hellguz: [TEMWA HURTSHA]! \n"
                    + "\n"
                    + "\"- Hurtsha apareceu e você deve derrotá-lo\"\n"
                    + "---- Lista de dano, Magias e Mana gasta de +nome+ ----\n"
                    + "Fogo 3 de dano e gasta 11 de mana por canalização\n"
                    + "Raio 5 de dano e gasta 9 de mana por canalização\n"
                    + "Gelo 9+2(BÔNUS) de dano e gasta 7 de mana.\n"
                    + "--------------------RESPONDA O DESAFIO-----------------\n"
                    + "Com base a seus 28 pontos de mana, qual das alternativas está correta? \n"
                    + "(A)Lançar Raio 4x\n"
                    + "(B)Lançar Fogo 3x\n"
                    + "(C)Lançar Gelo 5x\n");
            System.out.println("Responda:");
            desafio10C = input.nextLine().toLowerCase();
            if ("c".equals(desafio10C)) {
                System.out.println("Rei Hellguz: Hurtzdan sempre foi imprestável mesmo! \n"
                        + "\n"
                        + "Rei Hellguz: [TEMWA Arshork] !");
                break;
            }
            if (i == 0 && !"c".equals(desafio10C)) {
                System.out.println("Rei Hellguz: FUAHAHAHAHA ! Eu avisei, agora desapareçam! [DIMENSÃO INFERNAL]\n");

                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"c".equals(desafio10C)) {
                System.out.println("Rei Hellguz: FUAHAHAHAHA ! Eu avisei, agora desapareçam! [DIMENSÃO INFERNAL]\n");

                System.out.println("Você perdeu o jogo!");
                System.exit(0);//GAME OVER, seguido deste código que termina o jogo.
            }
        }
        return desafio10C;
    }

    public static String desafio10_D(String nomejogador) {
        String desafio10D = null;

        for (int i = 0; i < 2; i++) {
            System.out.println("-------------------QUESTÃO DESAFIO--------------------------\n"
                    + "Ashork possui uma armadura de prata de 55kg, ataques físicos magias de gelo e raio são inúteis, então resta utilizar sua magia de fogo,\n"
                    + "você precisa fundir a armadura de prata de Ashork e derrete-la junto com a armadura, para isso utilize a sua magia de fogo,\n"
                    + "lembrando sua mana atual é 48 e você não pode zerá-la. Quanto mais você lançar um magia de fogo menor o custo de mana,\n"
                    + " mas também menor a temperatura alcançada. Se para cada 1kg de prata é necessário 960 ºC, quantos graus Celsius, \n"
                    + "são necessários para fundir 55kg de prata?\n"
                    + "\n"
                    + "--------------------RESPONDA O DESAFIO-----------------\n"
                    + "(A) lançar fogo 5x 9.740 ºC mana gasta 11|\n"
                    + "(B) lançar fogo 2x 26.400 ºC mana gasta 29|\n"
                    + "(C) lançar fogo 6x 16.820ºC mana gasta 12|\n");
            System.out.println("Responda:");
            desafio10D = input.nextLine().toLowerCase();
            if ("b".equals(desafio10D)) {
                System.out.println("Rei Hellguz: JÁ CHEGA! IREI DESTRUIR VOCÊS COM MINHAS PRÓPRIAS MÃOS!\n");
                break;
            }
            if (i == 0 && !"b".equals(desafio10D)) {
                System.out.println("Rei Hellguz: FUAHAHAHAHA ! Eu avisei, agora desapareçam! [DIMENSÃO INFERNAL\n]");
                System.out.println("Você errou, possui somente mais uma tentativa.\n");
            }
            if (i == 1 && !"b".equals(desafio10D)) {
                System.out.println("Rei Hellguz: FUAHAHAHAHA ! Eu avisei, agora desapareçam! [DIMENSÃO INFERNAL]\n");
                System.out.println("Você perdeu o jogo!");
                System.exit(0);//GAME OVER, seguido deste código que termina o jogo.
            }
        }
        return desafio10D;
    }

    public static String desafioFinal_B(String nomejogador) {
        String desafioFinalB = null;

        System.out.println("----------------------QUESTÃO DESAFIO FINAL--------------------------\n"
                + "Parabéns você chegou ao desafio final!!!\n"
                + "Para evitar a destruição do planeta e derrotar o Rei Hellguz responda corretamente:\n"
                + "Em uma PG (progressão geométrica) decrescente, são conhecidos dois termos: a5 = 135 e a8 = 5. Determine qual é o primeiro termo dessa PG?\n"
                + "Considere: an = a1 · qn – 1\n"
                + "--------------------RESPONDA O DESAFIO-----------------\n"
                + "A) a1 = 10.935.\n"
                + "B) a1 = 9.500\n"
                + "C) a1 = 10.200\n");
        System.out.println("Responda:");
        desafioFinalB = input.nextLine().toLowerCase();
        if ("a".equals(desafioFinalB)) {
            System.out.println("Rei Hellguz: COMO PUDE SER DERROTADO POR SERES TÃO INSIGNIFICANTES?!!\n"
                    + "\n"
                    + nomejogador + ": Pague por tudo que você fez Orc maldito, agora vá para o seu verdadeiro lugar, o inferno!\n"
                    + "\n"
                    + "Mjönir: Seu plano falhou criatura ridícula.\n"
                    + "\n"
                    + "Rei Hellguz: NÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃÃOOOOOOOOOOOOOOOOOOOOOOOOOOOOO!!!");
        } else {
            System.out.println("Rei Hellguz: VOCÊS ME IRRTARAM AGORA DESAPAREÇAM!! [TERROR INFERNAL SUPREMO]\n");
            System.out.println("Você perdeu o jogo!");
            System.exit(0);//GAME OVER, seguido deste código que termina o jogo.
        }
        return desafioFinalB;
    }

    public static String finalVerdadeiroBom(String nomejogador) {//Este código defini o final verdadeiro ou o final bom, ele só acontece se o jogador escolher a rota A Cidade dos Anões e salvar Togriel.
        String finalBom = null;
        System.out.println(nomejogador + ": Conseguimos, agora vamos a máquina destruir este meteoro Togriel e anões!\n"
                + "\n"
                + "Mjönir: Ainda não criança, vocês precisam aprender as técnicas avançadas dos antigos 4 mestres do cálculo para manipular a Black Hole,\n"
                + "vamos até a máquina de absorção de conteúdo textual.\n"
                + "\n"
                + "Thönir: Sim vocês são dignos de serem os próximos mestres do cálculo também, provaram isso hoje a todos, bem vindos a equipe!\n"
                + "\n"
                + "Togriel: EU NÃO ACREDITOOOO " + nomejogador + " conseguimos!! Somos mestres do cálculo MARAVILHA, minha família ficara honrada!\n"
                + "\n"
                + nomejogador + ": Muito obrigado por essa oportunidade anões! Isso significa muito para Togriel e eu, mas espera ai, BLACK HOLE?\n "
                + "MÁQUINA DE ABSORÇÃO DE CONTEÚDO TEXTUAL?? O que são essas coisas.\n"
                + "\n"
                + "Thönir e Mjönir: HAHAHAHAHA\n"
                + "\n"
                + nomejogador + ": Qual a graça galera?\n"
                + "\n"
                + "Thönir: a calme-se jovem rapaz, a Máquina de absorção de conteúdo textual, foi inventada por mim, mas ainda não dei um bom nome a ela,\n"
                + "mas como diz o que faz é obvio, ela absorve todo conteúdo escrito em algum local e passa diretamente para o seu cérebro, onde você\n"
                + " nunca mais esquecera do conteúdo apresentado. Ah e leva só 5 minutos é rapidinho.\n"
                + "\n"
                + "Mjönir: E a Black Hole, é uma invenção minha, essa vocês conhecem, é a máquina capaz de destruir uma estrela. Eu a apelidei assim, mas para\n"
                + " utilizá-la vocês precisam saber todo conteúdo do pergaminho, então vamos sem perder tempo.\n"
                + "\n"
                + nomejogador + ": Mas e o meteoro ?! já está muito próximo não podemos demorar! \n"
                + "\n"
                + "Thönir: Relaxem, depois da morte de Hellguz, ele parece estar mais lento segundo aos meus cálculos!\n"
                + "\n"
                + "\"- Após chegarem à sala onde " + nomejogador + " e Togriel, absorveram todo conteúdo do pergaminho, eles saem de la como os MESTRES DO CÁLCULO, se direcionando\n"
                + "diretamente para a sala da Black Hole. Chegando lá os anões sentam em suas posições de ataque, e +nome+ e Togriel na posição defensiva da máquina,\n"
                + "onde irá projetar um escudo em volta da atmosfera do planeta Uriel, desintegrando qualquer coisa que o tocá-lo.\n"
                + "- Sendo assim " + nomejogador + ", Togriels, Thönir e Mjönir, se tornam os mais novos mestres do cálculo do planeta Uriel. O salvando da ameaça dos Orcs e\n"
                + "meteoros. E assim voltaram a suas famílias, Togriel e +nome+ agora podem se ver sempre e ir para cidade do cálculo.\n"
                + "Graças a você " + nomejogador + " o planeta está a salvo e os que morreram em batalha descansam em paz.\n"
                + "\n"
                + "OBRIGADO POR TER SALVO NOSSO PLANETA " + nomejogador + "!\n"
                + "\n"
                + "-----------------------------------FIM-----------------------------------------");
        System.exit(0);//GAME OVER

        return finalBom;
    }

    public static String finalFalsoRuim(String nomejogador) {
        String finalRuim = null;
        System.out.println(nomejogador + ": Conseguimos, agora vamos a máquina destruir este meteoro anões!\n"
                + "\n"
                + "Mjönir: Ainda não criança, você precisa aprender as técnicas avançadas dos antigos 4 mestres do cálculo para manipular a Black Hole, vamos até a\n"
                + "máquina de absorção de conteúdo textual.\n"
                + "\n"
                + "Thönir: Sim você é digno de ser o próximo mestres do cálculo também, sendo assim, só faltará mais um para completar a proteção do nosso planeta.\n"
                + "Você provou isso hoje a todos, bem vindo a equipe!\n"
                + "\n"
                + nomejogador + ": Muito obrigado por essa oportunidade anões! Isso significa muito para e meu falecido amigo Togriel e... eu... adoraria que ele estivesse\n"
                + " comigo agora... Mas espera ai, Black Hole ? MAQUINA DE ABSORÇÃO DE CONTEÚDO TEXTUAL?? O que são essas coisas.\n"
                + "\n"
                + "Thönir e Mjönir: HAHAHAHAHA,\n"
                + "\n"
                + nomejogador + ": Qual a graça galera?\n"
                + "\n"
                + "Thönir: a calme-se jovem rapaz, a Máquina de absorção de conteúdo textual, foi inventada por mim, mas ainda não dei um bom nome a ela, mas como\n"
                + "diz o que faz é obvio, ela absorve todo conteúdo escrito em algum local e passa diretamente para o seu cérebro, onde você nunca mais esquecera\n"
                + " do conteúdo apresentado. Ah e leva só 5 minutos é rapidinho.\n"
                + "\n"
                + "Mjönir: E a Black Hole, é uma invenção minha, essa você conhece, é a máquina capaz de destruir uma estrela. Eu a apelidei assim, mas para utilizá-la\n"
                + " você precisa saber todo conteúdo do pergaminho, então vamos absorver logo o conteúdo desse pergaminho sem perder tempo.\n"
                + "\n"
                + nomejogador + ": Mas e o meteoro ?! já está muito próximo não podemos demorar!\n"
                + "\n"
                + "Thönir: Relaxe, depois da morte de Hellguz, ele parece estar mais lento segundo aos meus cálculos!\n"
                + "\n"
                + "\"- Após chegarem à sala onde " + nomejogador + ", absorve todo conteúdo do pergaminho, e sai de la como o MESTRE DO CÁLCULO, se direcionando diretamente para\n"
                + " a sala da Black Hole. Chegando lá os anões se sentam em suas posições de ataque, e +nome+ na posição direta defensiva do escudo desintegrador, a posição\n"
                + " de lado esquerdo fica sem um mestre do cálculo para operá-la onde Togriel poderia estar se fosse salvo. Sendo assim uma parte do planeta sofrerá o\n"
                + "impacto e irá destruir algumas famílias e casas. A máquina, projeta um escudo em ao lado direito da atmosfera do planeta Uriel, desintegrando qualquer\n"
                + " coisa que o tocá-lo.\n"
                + "- Sendo assim " + nomejogador + ", Thönir e Mjönir se tornam os mais novos mestres do cálculo do planeta Uriel. O salvando da ameaça dos Orcs e o meteoro. E assim\n"
                + nomejogador + " volta a sua cidade, e vai até a cidade de Togriel e encontram seu corpo dentro de um caixão mágico.\n"
                + nomejogador + " pediu para os anões construir uma enorme lápide com a frase de \" Descanse em paz nosso HEROI TOGRIEL \". Sendo assim Togriel fica conhecido como\n"
                + " herói. Agora os sobreviventes do planeta começam a reconstruir as perdas.\n"
                + "Graças a você " + nomejogador + " o planeta está a salvo, mas com perdas importantes, e a os que morreram em batalha descansam em paz.\n"
                + "\n"
                + "OBRIGADO POR TER SALVO NOSSO PLANETA " + nomejogador + "!\n"
                + "\n"
                + "-----------------------------------FIM----------------------------------------");
        System.exit(0);//GAME OVER
        return finalRuim;
    }

    //metodo que percorre a história A.
    public static String opcaoA(String nomejogador) {
        desafio01_A(nomejogador);
        desafio02_A(nomejogador);
        desafio03_A(nomejogador);
        desafio04_A(nomejogador);
        desafio05_A(nomejogador);
        desafio06_A(nomejogador);
        desafio07_A(nomejogador);
        desafio08_A(nomejogador);
        desafio09_A(nomejogador);
        desafio10_A(nomejogador);
        desafio10_B(nomejogador);
        desafioFinal_A(nomejogador);
        finalVerdadeiroBom(nomejogador);
        return null;
    }

    //metodo que percorre a história B.
    public static String opcaoB(String nomejogador) {
        desafio01_B(nomejogador);
        desafio02_B(nomejogador);
        desafio03_B(nomejogador);
        desafio04_B(nomejogador);
        desafio05_B(nomejogador);
        desafio06_B(nomejogador);
        desafio07_B(nomejogador);
        desafio08_B(nomejogador);
        desafio09_B(nomejogador);
        desafio10_C(nomejogador);
        desafio10_D(nomejogador);
        desafioFinal_B(nomejogador);
        finalFalsoRuim(nomejogador);
        return null;
    }

    //metodo de decisão. Define qual história irá seguir de acordo com a escolhe do jogador.
    public static String decisao(String nomejogador, String historia) {// este código define quais são os desafios que iram aparecer no jogo.

        if ("b".equals(historia)) { //escolhendo a letra b, resultara a esse código. 
            opcaoB(nomejogador);
        } else {//Se for a, resultara neste código.
            opcaoA(nomejogador);
        }
        return null;
    }

    public static void main(String[] args) {
        // Menu principal do jogo.
        menu();
        // Criando nome do jogador.
        String nomejogador = nomedoJogador();
        // Criando sexo do jogador
        sexodoJogador();
        // História do jogo.
        String historia = historia(nomejogador);
        // Função que decide qual caminho o jogador irá percorrer de acordo com as respostas.
        decisao(nomejogador, historia);

    }
}
