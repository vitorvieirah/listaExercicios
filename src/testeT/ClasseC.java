package testeT;

import java.util.Random;
import java.util.Scanner;

public class ClasseC{
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            //parte 1 - apresentação
            Boolean ciclo1 = true;
            int somadospassos = 0;
            while (ciclo1) {

                String teste = "e";
                System.out.println("Bem vindo ao Zombie Dice!!!!!!!!");
                System.out.println("Depois de ler as regras, digite a quantidades de jogadores");
                int jogadores;
                jogadores = sc.nextInt();
                if (jogadores < 2) {
                    System.out.println("Numero de jogadores invalido, leia novamente as regras");
                    System.exit(1);
                }
                System.out.println("Agora vamos ver quem vai começar, teve algum vencedor a ultima partida ?");
                String vencedor;
                vencedor = sc.next();
                if (vencedor.matches("sim")) {
                    System.out.println("Então o vencedor deve começar");
                } else {
                    System.out.println("Então a pessoa que falar cérebroooooo!!!! da maneira mais zumbi começa");
                }
                System.out.println("Boa partida e boa sorte com os cerebroooossss!!!");

                // parte 2 - jogo em andamento
                int quantdados = 0;
                // ciclo1 é o jogo em andamento
                boolean ciclo3 = true;
                while (ciclo3) {

                    int cerebros = 0;
                    int espingarda = 0;
                    Boolean ciclo2 = true;
                    // ciclo2 são os turnos
                    while (ciclo2) {
                        Random random = new Random();
                        char vermelhoChar = 'e';
                        char verdeChar = 'e';
                        char amareloChar = 'e';
                        char vermelhoChar2 = 'e';
                        char amareloChar2 = 'e';
                        char verdeChar2 = 'e';
                        char vermelhoCha3 = 'c';
                        char amareloChar3 = 'c';
                        char verdeChar3 = 'c';
                        char passos = 'p';

                        // o dado do jogo
                        int[] letrasdodado = new int[3];
                        boolean stop = true;
                        int dado = 1;
                        while (stop) {
                            Random selecao = new Random();
                            int numero = selecao.nextInt(10);
                            if (dado == 1) {
                                letrasdodado[0] = numero;
                            }
                            if (dado == 2) {
                                letrasdodado[1] = numero;

                            }
                            if (dado == 3) {
                                letrasdodado[2] = numero;

                                stop = false;
                            }
                            dado++;
                        }
                        //Sortei do dado
                        for (int i = 0; i < letrasdodado.length - 1; i++) {
                            if (i == 1) {
                                String dadover = "eeeppc";
                                int vermelhoInt = random.nextInt(dadover.length());
                                vermelhoChar = dadover.charAt(vermelhoInt);
                                if (vermelhoChar == 'e') {
                                    System.out.println("Você tirou o dado:" + "VERMELHO");
                                    System.out.println("Tipo do dado:" + "ESPINGARDA");
                                }
                                if (vermelhoChar == 'p') {
                                    System.out.println("Você tirou o dado:" + "VERMELHO");
                                    System.out.println("Tipo do dado:" + "PASSOS");
                                }
                                if (vermelhoChar == 'c') {
                                    System.out.println("Você tirou o dado:" + "VERMELHO");
                                    System.out.println("Tipo do dado:" + "CEREBRO");
                                }

                            }
                            if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6) {
                                String dadoverde = "cccppe";
                                int verdeInt = random.nextInt(dadoverde.length());
                                verdeChar = dadoverde.charAt(verdeInt);
                                if (verdeChar == 'e') {
                                    System.out.println("Você tirou o dado:" + "VERDE");
                                    System.out.println("Tipo do dado:" + "ESPINGARDA");
                                }
                                if (verdeChar == 'p') {
                                    System.out.println("Você tirou o dado:" + "VERDE");
                                    System.out.println("Tipo do dado:" + "PASSOS");
                                }
                                if (verdeChar == 'c') {
                                    System.out.println("Você tirou o dado:" + "VERDE");
                                    System.out.println("Tipo do dado:" + "CEREBRO");
                                }

                            } else {
                                String dadoama = "eeppcc";
                                int amareloInt = random.nextInt(dadoama.length());
                                amareloChar = dadoama.charAt(amareloInt);
                                if (amareloChar == 'e') {
                                    System.out.println("Você tirou o dado:" + "AMARELO");
                                    System.out.println("Tipo do dado:" + "ESPINGARDA");
                                }
                                if (amareloChar == 'p') {
                                    System.out.println("Você tirou o dado:" + "AMARELO");
                                    System.out.println("Tipo do dado:" + "PASSOS");
                                }
                                if (amareloChar == 'c') {
                                    System.out.println("Você tirou o dado:" + "AMARELO");
                                    System.out.println("Tipo do dado:" + "CEREBRO");
                                }
                            }
                            if (vermelhoChar == vermelhoCha3) {
                                cerebros++;
                            }
                            if (verdeChar == verdeChar3) {
                                cerebros++;
                            }
                            if (amareloChar == amareloChar3) {
                                cerebros++;
                            }
                            if (cerebros == 13) {
                                System.out.println("Meus parabens, você venceu o jogo!!!!1");
                                System.out.println("Até a próxima e obrigado por jogar");
                                ciclo1 = false;
                            }
                        }
                        //Soma dos pontos



                        //Controle da quantidade de dados no jogo
                        String aux1;
                        int dados2;
                        int dados = 10;

                        if (vermelhoChar == passos) {
                            somadospassos++;
                        }
                        if (verdeChar == passos) {
                            somadospassos++;
                        }
                        if (amareloChar == passos) {
                            somadospassos++;
                        }
                        if (somadospassos == 3){
                            for (int i = 0; i < letrasdodado.length - 1; i++) {
                                if (i == 1) {
                                    String dadover = "eeeppc";
                                    int vermelhoInt = random.nextInt(dadover.length());
                                    vermelhoChar = dadover.charAt(vermelhoInt);
                                    if (vermelhoChar == 'e') {
                                        System.out.println("Você tirou o dado:" + "VERMELHO");
                                        System.out.println("Tipo do dado:" + "ESPINGARDA");
                                    }
                                    if (vermelhoChar == 'p') {
                                        System.out.println("Você tirou o dado:" + "VERMELHO");
                                        System.out.println("Tipo do dado:" + "PASSOS");
                                    }
                                    if (vermelhoChar == 'c') {
                                        System.out.println("Você tirou o dado:" + "VERMELHO");
                                        System.out.println("Tipo do dado:" + "CEREBRO");
                                    }

                                }
                                if (i == 2 || i == 3 || i == 4 || i == 5 || i == 6) {
                                    String dadoverde = "cccppe";
                                    int verdeInt = random.nextInt(dadoverde.length());
                                    verdeChar = dadoverde.charAt(verdeInt);
                                    if (verdeChar == 'e') {
                                        System.out.println("Você tirou o dado:" + "VERDE");
                                        System.out.println("Tipo do dado:" + "ESPINGARDA");
                                    }
                                    if (verdeChar == 'p') {
                                        System.out.println("Você tirou o dado:" + "VERDE");
                                        System.out.println("Tipo do dado:" + "PASSOS");
                                    }
                                    if (verdeChar == 'c') {
                                        System.out.println("Você tirou o dado:" + "VERDE");
                                        System.out.println("Tipo do dado:" + "CEREBRO");
                                    }

                                } else {
                                    String dadoama = "eeppcc";
                                    int amareloInt = random.nextInt(dadoama.length());
                                    amareloChar = dadoama.charAt(amareloInt);
                                    if (amareloChar == 'e') {
                                        System.out.println("Você tirou o dado:" + "AMARELO");
                                        System.out.println("Tipo do dado:" + "ESPINGARDA");
                                    }
                                    if (amareloChar == 'p') {
                                        System.out.println("Você tirou o dado:" + "AMARELO");
                                        System.out.println("Tipo do dado:" + "PASSOS");
                                    }
                                    if (amareloChar == 'c') {
                                        System.out.println("Você tirou o dado:" + "AMARELO");
                                        System.out.println("Tipo do dado:" + "CEREBRO");
                                    }
                                }
                                if (vermelhoChar == vermelhoCha3) {
                                    cerebros++;
                                }
                                if (verdeChar == verdeChar3) {
                                    cerebros++;
                                }
                                if (amareloChar == amareloChar3) {
                                    cerebros++;
                                }
                                if (cerebros == 13) {
                                    System.out.println("Meus parabens, você venceu o jogo!!!!1");
                                    System.out.println("Até a próxima e obrigado por jogar");
                                    ciclo1 = false;
                                }
                            }
                        }
                        if (somadospassos == 1) {
                            dados2 = dados - 2;
                        }
                        if (somadospassos == 2) {
                            dados2 = dados - 1;
                        } else {
                            dados2 = dados - 3;
                        }
                        if (vermelhoChar == vermelhoChar2 && verdeChar == verdeChar2 && amareloChar == amareloChar2) {
                            System.out.println("3 espirgardas, o turnou acabou.");
                            System.out.println("Você adquiriu" + cerebros + " de pontos, muito bemm!!!");
                        }
                        //Final do jogo2
                        if (dados < 3) {
                            System.out.println("Dados insuficientes para continuar");
                            System.out.println("Sua pontuação foi de:" + cerebros);
                            System.out.println("Digite P para o próximo jogador");
                            ciclo2 = false;
                        }


                        System.out.println("Agora você pode parar por aqui ou continuar");
                        System.out.println("Se deseja continuar digite SIM");
                        System.out.println("Caso deseje parar digite NAO");
                        String b;
                        b = sc.next();

                        if (b.matches("sim")) {
                            System.out.println("Muito bem, vamos lá então:");
                            ciclo3 = false;
                        }
                        String c;
                        c = sc.next();
                        if (c.matches("nao")) {
                            System.out.println("Que pena que decidiu parar, muito obrigo pela participação e até a proxima zumbi!!!!");
                            System.out.println("Você adquiriu" + cerebros + " de pontos, muito bemm!!!");
                            System.exit(0);
                        }

                    }
                }
            }
        }
    }
