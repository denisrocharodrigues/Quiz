import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cabecalho cab = new Cabecalho();

        cab.faculdade = "Centro Universitário Alfredo Nasser";
        cab.aluno = "Wilson Dênis Rocha Rodrigues";
        cab.professor = "Brenno Pimenta";
        cab.tema = "Conhecimentos Gerais";

        cab.mostrar();

        ArrayList<Questao> questoes = new ArrayList<>();

        // ================= QUESTÃO 1 =================
        Questao q1 = new Questao();
        q1.pergunta = "Qual o maior oceano do mundo?";
        q1.opcaoA = "A) Atlântico";
        q1.opcaoB = "B) índico";
        q1.opcaoC = "C) Ártico";
        q1.opcaoD = "D) Pacífico";
        q1.opcaoE = "E) Antártico";
        q1.correta = "D";
        questoes.add(q1);

        // ================= QUESTÃO 2 =================
        Questao q2 = new Questao();
        q2.pergunta = "Qual é o maior órgão do corpo humano?";
        q2.opcaoA = "A) Coração";
        q2.opcaoB = "B) Pulmão";
        q2.opcaoC = "C) Pele";
        q2.opcaoD = "D) Fígado";
        q2.opcaoE = "E) Rim";
        q2.correta = "C";
        questoes.add(q2);

        // ================= QUESTÃO 3 =================
        Questao q3 = new Questao();
        q3.pergunta = "Qual o antônimo de rápido?";
        q3.opcaoA = "A) Lento";
        q3.opcaoB = "B) Alto";
        q3.opcaoC = "C) Leve";
        q3.opcaoD = "D) Ágil";
        q3.opcaoE = "E) Forte";
        q3.correta = "A";
        questoes.add(q3);

        // ================= QUESTÃO 4 =================
        Questao q4 = new Questao();
        q4.pergunta = "Qual é o 4° planeta do nosso sistema solar?";
        q4.opcaoA = "A) Mercúrio";
        q4.opcaoB = "B) Terra";
        q4.opcaoC = "C) Netuno";
        q4.opcaoD = "D) Júpter";
        q4.opcaoE = "E) Marte";
        q4.correta = "E";
        questoes.add(q4);

        // ================= QUESTÃO 5 =================
        Questao q5 = new Questao();
        q5.pergunta = "Qual é o coletico de cachorros?";
        q5.opcaoA = "A) Alcateia";
        q5.opcaoB = "B) Bando";
        q5.opcaoC = "C) Rebanho";
        q5.opcaoD = "D) Matilha";
        q5.opcaoE = "E) Cardume";
        q5.correta = "D";
        questoes.add(q5);

        // ================= QUESTÃO 6 =================
        Questao q6 = new Questao();
        q6.pergunta = "Qual civilização construiu as pirâmides de Gizé?";
        q6.opcaoA = "A) Romana";
        q6.opcaoB = "B) Egípcia";
        q6.opcaoC = "C) Asteca";
        q6.opcaoD = "D) Grega";
        q6.opcaoE = "E) Maia";
        q6.correta = "B";
        questoes.add(q6);

        // ================= QUESTÃO 7 =================
        Questao q7 = new Questao();
        q7.pergunta = "Quem foi o imperador do Brasil na independência?";
        q7.opcaoA = "A) Deodoro da Fonseca";
        q7.opcaoB = "B) Getúlio Vargas";
        q7.opcaoC = "C) Dom Pedro l";
        q7.opcaoD = "D) Pedro Álvares Cabral";
        q7.opcaoE = "E) Dom Pedro ll";
        q7.correta = "C";
        questoes.add(q7);

        // ================= QUESTÃO 8 =================
        Questao q8 = new Questao();
        q8.pergunta = "Qual é o rio mais extenso do mundo?";
        q8.opcaoA = "A) Rio Nilo";
        q8.opcaoB = "B) Rio Ganges";
        q8.opcaoC = "C) Rio Tietê";
        q8.opcaoD = "D) Rio São Francisco";
        q8.opcaoE = "E) Rio Amazonas";
        q8.correta = "E";
        questoes.add(q8);

        // ================= QUESTÃO 9 =================
        Questao q9 = new Questao();
        q9.pergunta = "Qual continente tem o maior número de países?";
        q9.opcaoA = "A) África";
        q9.opcaoB = "B) Europa";
        q9.opcaoC = "C) Américas";
        q9.opcaoD = "D) Ásia";
        q9.opcaoE = "E) Oceania";
        q9.correta = "A";
        questoes.add(q9);

        // ================= QUESTÃO 10 =================
        Questao q10 = new Questao();
        q10.pergunta = "Qual é o menor país do mundo?";
        q10.opcaoA = "A) Russia";
        q10.opcaoB = "B) Vaticano";
        q10.opcaoC = "C) Nigéria";
        q10.opcaoD = "D) Portugal";
        q10.opcaoE = "E) Guiana";
        q10.correta = "B";
        questoes.add(q10);

        // ================= QUESTÃO 11 =================
        Questao q11 = new Questao();
        q11.pergunta = "Qual desses materiais é o melhor condutor elétrico?";
        q11.opcaoA = "A) Vidro";
        q11.opcaoB = "B) Plástico";
        q11.opcaoC = "C) Cobre";
        q11.opcaoD = "D) Ouro";
        q11.opcaoE = "E) Alumínio";
        q11.correta = "D";
        questoes.add(q11);

        // ================= QUESTÃO 12 =================
        Questao q12 = new Questao();
        q12.pergunta = "Qual é o plural de 'pão'?";
        q12.opcaoA = "A) Pãos";
        q12.opcaoB = "B) Pões";
        q12.opcaoC = "C) Pães";
        q12.opcaoD = "D) Pãoses";
        q12.opcaoE = "E) Pãis";
        q12.correta = "C";
        questoes.add(q12);

        // ================= QUESTÃO 13 =================
        Questao q13 = new Questao();
        q13.pergunta = "Quem foi o primeiro homem a pisar na Lua?";
        q13.opcaoA = "A) Robert Queen";
        q13.opcaoB = "B) Harvey Ross";
        q13.opcaoC = "C) Michael Collins";
        q13.opcaoD = "D) Patric Jane";
        q13.opcaoE = "E) Neil Armstrong";
        q13.correta = "E";
        questoes.add(q13);

        // ================= QUESTÃO 14 =================
        Questao q14 = new Questao();
        q14.pergunta = "Qual país tem o maior número de habitantes do mundo?";
        q14.opcaoA = "A) Índia";
        q14.opcaoB = "B) Russia";
        q14.opcaoC = "C) Brasil";
        q14.opcaoD = "D) China";
        q14.opcaoE = "E) Estados Unidos";
        q14.correta = "A";
        questoes.add(q14);

        // ================= QUESTÃO 15 =================
        Questao q15 = new Questao();
        q15.pergunta = "Em que ano o Brasil foi descoberto?";
        q15.opcaoA = "A) 1885";
        q15.opcaoB = "B) 1530";
        q15.opcaoC = "C) 1492";
        q15.opcaoD = "D) 1500";
        q15.opcaoE = "E) 1945";
        q15.correta = "D";
        questoes.add(q15);

        int acertos = 0;

        for (int i = 0; i < questoes.size(); i++) {

            System.out.println("Questão " + (i + 1));

            questoes.get(i).escrevaQuestao();

            String resposta = questoes.get(i).leiaResposta();

            if (questoes.get(i).isCorreta(resposta)) {
                acertos++;
            }
        }

        System.out.println("===== RESULTADO =====");
        System.out.println("Acertos: " + acertos);

        double media = (acertos / (double) questoes.size()) * 10;
        System.out.printf("Média: %.2f\n", media);

        double porcentagem = (acertos * 100.0) / questoes.size();
        System.out.println("Porcentagem: " + porcentagem + "%");

        System.out.println("======================");
        System.out.println("Obrigado por participar do quiz");

    }
}
