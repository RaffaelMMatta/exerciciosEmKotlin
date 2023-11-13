package exercicios
import java.text.DateFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

// 1- Faça um Programa que peça dois números e imprima o maior deles.
/*fun main(){
    print("num1: ")
    val num1 = readln().toInt()
    print("num2: ")
    val num2 = readln().toInt()
    if(num1 > num2){
        println("$num1 é o maior")
    }
    else
        println("$num2 é maior")
}*/

// 2- Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

/*fun main(){
    print("Digite um valor: ")
    val num = readln().toInt()
    if(num >= 0){
        println("$num é positivo")
    }else{
        println("$num é negativo")
    }
}*/

// 3- Faça um Programa que verifique se uma letra digitada é "F" ou "M".
// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

/*fun main(){
    print("Digite seu sexo (F- Feminino, M- masculino)")
    val sexo = readln()[0]
    if(sexo == 'F' || sexo == 'f'){
        println("Sexo Feminino foi escolhido")
    }
    else if(sexo == 'M' || sexo == 'm'){
        println("sexo Masculino foi escolhido")
    }
    else{
        println("valor invalido!")
    }
}*/

// 4- Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

/*fun main(){
    print("digite um letra: ")
    val letra = readln()[0]
    when(letra){
        'a', 'e', 'i', 'o', 'u','A','E','I','O', 'U' -> println("é uma vogal")
        else -> println("é uma consoante")
    }
}*/

// 5- Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
//  A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//  A mensagem "Reprovado", se a média for menor do que sete;
//  A mensagem "Aprovado com Distinção", se a média for igual a dez.
/*fun main(){
    print("Digite a primeira nota: ")
    val n1 = readln().toDouble()
    print("Digite a segunda nota: ")
    val n2 = readln().toDouble()
    if((n1+n2)/2.0 >= 10.0){
        println("Aprovado com distinção!!")
    }
    else if((n1+n2)/2.0 > 7.0 ){
        println("Aprovado!!")
    }
    else{
        println("Reprovado!!")
    }
}*/

// 6- Faça um Programa que leia três números e mostre o maior deles.
/*fun main(){
    println("Digite o primeiro numero")
    val num1 = readln().toInt()
    println("Digite o segundo numero")
    val num2 = readln().toInt()
    println("Digite o terceiro numero")
    val num3 = readln().toInt()
    if(num1 >= num2 && num1 >= num3){
        println("$num1 é o maior")
    }
    else if(num2 >= num3){
        println("$num2 é o maior")
    }
    else {
        println("$num3 é o maior")
    }

}*/

// 7- Faça um Programa que leia três números e mostre o maior e o menor deles.
/*fun main(){
    println("Digite o primeiro numero")
    val num1 = readln().toInt()
    println("Digite o segundo numero")
    val num2 = readln().toInt()
    println("Digite o terceiro numero")
    val num3 = readln().toInt()
    if(num1 >= num2 && num1 >= num3){
        if(num2 < num3)
            println("$num1 é o maior e o $num2 é o menor")
        else
            println("$num1 é o maior e o $num3 é o menor")
    }
    else if(num2 >= num3){
        if(num1 < num3)
            println("$num2 é o maior e o $num1 é o menor")
        else
            println("$num2 é o maior e o $num3 é o menor")
    }
    else {
        if(num1 < num2)
            println("$num3 é o maior e o $num1 é o menor")
        else
            println("$num3 é o maior e o $num2 é o menor")
    }

}*/

// 8- Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
// sabendo que a decisão é sempre pelo mais barato.
/*fun main(){
    println("Digite o primeiro preço")
    val num1 = readln().toDouble()
    println("Digite o segundo preço")
    val num2 = readln().toDouble()
    println("Digite o terceiro preço")
    val num3 = readln().toDouble()
    if(num1 <= num2 && num1 <= num3){
        println("$num1 é o menor preço")
    }
    else if(num2 <= num3){
        println("$num2 é o menor preço")
    }
    else {
        println("$num3 é o menor preço")
    }
}*/


// 9- Faça um Programa que leia três números e mostre-os em ordem decrescente.
/*fun main() {
    println("Digite o primeiro numero")
    val num1 = readln().toInt()
    println("Digite o segundo numero")
    val num2 = readln().toInt()
    println("Digite o terceiro numero")
    val num3 = readln().toInt()
    if (num1 >= num2 && num1 >= num3) {
        if (num2 > num3)
            println("$num1, $num2, $num3 ")
        else
            println("$num1, $num3, $num2")
    } else if (num2 >= num3) {
        if (num1 > num3)
            println("$num2, $num1, $num3")
        else
            println("$num2, $num3, $num1")
    } else {
        if (num1 > num2)
            println("$num3, $num1, $num2")
        else
            println("$num3, $num2, $num1")
    }

}*/


//10- Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
//Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
/*fun main(){
    print("Digite um M- Matutino, V- vespertino, N- Noturno: ")
    val turno = readln()[0]
    when(turno){
        'm', 'M' -> println("Bom Dia!!")
        'v', 'V' -> println("Boa Tarde!!")
        'n', 'N' -> println("Boa Noite!!")
        else -> println("Valor invalido!!")
    }
}*/

//11- As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver
// o programa que calculará os reajustes.
//Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
//salários até R$ 280,00 (incluindo) : aumento de 20%
//salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
//o salário antes do reajuste;
//o percentual de aumento aplicado;
//o valor do aumento;
//o novo salário, após o aumento.
/*
fun main(){
    print("Digite seu salario: ")
    val salario = readln().toDouble()

    when{
        salario <= 280.00 -> println("Salario atual: R$ $salario\nPercentual de aumento: 20%\nSalario Com Reajuste: R$ ${salario*1.20}")
        salario <= 700.00 -> println("Salario atual: R$ $salario\nPercentual de aumento: 15%\nSalario Com Reajuste: R$ ${salario*1.15}")
        salario < 1500.00 -> println("Salario atual: R$ $salario\nPercentual de aumento: 10%\nSalario Com Reajuste: R$ ${salario*1.10}")
        else -> println("Salario atual: R$ $salario\nPercentual de aumento: 5%\nSalario Com Reajuste: R$ ${salario*1.05}")
    }
}*/


//12- Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda,
// que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a
// 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao
// Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade
// de horas trabalhadas no mês.
//Desconto do IR:
//Salário Bruto até 900 (inclusive) - isento
//Salário Bruto até 1500 (inclusive) - desconto de 5%
//Salário Bruto até 2500 (inclusive) - desconto de 10%
//Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
//        Salário Bruto: (5 * 220)        : R$ 1100,00
//        (-) IR (5%)                     : R$   55,00
//        (-) INSS ( 10%)                 : R$  110,00
//        FGTS (11%)                      : R$  121,00
//        Total de descontos              : R$  165,00
//        Salário Liquido                 : R$  935,00

/*
fun main(){
    print("Qual valor da sua hora: ")
    val valorPorHora = readln().toDouble()
    print("Quantas horas voce trabalhou no mes: ")
    val horasTrabalhada = readln().toInt()
    var count = 0.0
    val salario = valorPorHora * horasTrabalhada
    var ir = 0
    when{
        salario <= 900.00 -> count = salario * 0.10
        salario <= 1500.00 -> {count = salario * 0.10 + salario * 0.05; ir = 5}
        salario <= 2500.00 -> {count = salario * 0.10 + salario * 0.10; ir = 10}
        else -> {count = salario * 0.10 + salario * 0.20; ir = 20}
    }
    println(
        """          
        Salário Bruto: ($valorPorHora * $horasTrabalhada)      : R$ $salario
        (-) IR ($ir%)                    : R$  ${salario * (ir / 100.0)}
        (-) INSS (10%)                  : R$  ${salario * 0.10}
        FGTS (11%)                      : R$  ${salario * 0.11}
        Total de descontos              : R$  $count
        Salário Liquido                 : R$  ${salario - count}
        """.trimIndent()
    )
}*/

//13- Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-Domingo, 2- Segunda, etc.),
// se digitar outro valor deve aparecer valor inválido.

/*
fun main(){
    print("Digite um numero de 1 ate 7: ")
    val dia = readln().toInt()
    when(dia){
        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terça")
        4 -> println("Quarta")
        5 -> println("Quinta")
        6 -> println("Sexta")
        7 -> println("Sabado")
        else -> println("Valor invalido!")
    }
}*/

//14- Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e
// calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
//  Média de Aproveitamento  Conceito
//  Entre 9.0 e 10.0        A
//  Entre 7.5 e 9.0         B
//  Entre 6.0 e 7.5         C
//  Entre 4.0 e 6.0         D
//  Entre 4.0 e zero        E
//O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o
// conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E.
/*
fun main(){
    print("Digite a Nota1: ")
    val nota1 = readln().toDouble()
    print("Digite a Nota2: ")
    val nota2 = readln().toDouble()
    when{
        (nota1 + nota2) / 2.0 >= 9.0 -> println("nota1: $nota1\nNota2: $nota2\nMedia: ${(nota1 + nota2) / 2.0}\nConceito: A\nAPROVADO")
        (nota1 + nota2) / 2.0 >= 7.5 -> println("nota1: $nota1\nNota2: $nota2\nMedia: ${(nota1 + nota2) / 2.0}\nConceito: B\nAPROVADO")
        (nota1 + nota2) / 2.0 >= 6.0 -> println("nota1: $nota1\nNota2: $nota2\nMedia: ${(nota1 + nota2) / 2.0}\nConceito: C\nAPROVADO")
        (nota1 + nota2) / 2.0 >= 4.0 -> println("nota1: $nota1\nNota2: $nota2\nMedia: ${(nota1 + nota2) / 2.0}\nConceito: D\nREPROVADO")
        else -> println("nota1: $nota1\nNota2: $nota2\nMedia: ${(nota1 + nota2) / 2.0}\nConceito: E\nREPROVADO")
    }
}*/

//15- Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
//Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
//Dicas:
//Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
//Triângulo Equilátero: três lados iguais;
//Triângulo Isósceles: quaisquer dois lados iguais;
//Triângulo Escaleno: três lados diferentes;

/*fun main(){

    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    if(a+b > c || b+c > a){
        when{
            a == b && a == c -> println("Triangulo Equilátero")
            a == b || a == c || b == c -> println("triangulo Isósceles")
            else -> println("Triangulo escaleno")
        }
    }
    else println("Não forma um triangulo")
}*/

//16- Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir
// os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
//Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais valores, sendo encerrado;
//Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
//Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
//Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;

/*fun main(){
    val a = readln().toInt()
    if(a != 0){
        val b = readln().toInt()
        val c = readln().toInt()
        val delta = b*b - 4*a*c
        when{
            delta < 0 -> println("a equaçào não possui raizes reais")
            delta == 0 -> println("a equação possui apenas uma raiz real: ${-b + sqrt(0.0) /2*a}")
            else -> println("x1 = ${b + sqrt(delta.toDouble()) /2*a}\nx2 = ${-b + sqrt(delta.toDouble()) /2*a} ")
        }

    }
    else println("não é uma equação")

}*/

//17- Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.

/*fun main(){
    val ano = readln().toInt()
    if(ano % 4 == 0) println("$ano é um ano bissexto")
    else println("$ano não é um ano bissexto")
}*/

//18- Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do mesmo.
//Observando os termos no plural a colocação do "e", da vírgula entre outros. Exemplo:
//326 = 3 centenas, 2 dezenas e 6 unidades
//12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
/*fun main(){
    print("Digite um valor abaixo de 1000: ")
    val num = readln().toInt()
    var count = num
    if(num < 1000) {
        val centena = num / 100;
        count -= centena * 100
        val dezena = count / 10
        count -= dezena * 10
        println("$num: $centena centenas, $dezena dezenas, $count unidades")
    }
    else println("Valor invalido!!!")
}*/

//19- Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e presentar:
//A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
//A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
//A mensagem "Aprovado com Distinção", se a média for igual a 10.
/*fun main(){
    val nota1 = readln().toDouble()
    val nota2 = readln().toDouble()
    val nota3 = readln().toDouble()
    val media = (nota1 + nota2 + nota3) / 3.0
    when{
        media == 10.0 -> println("Aprovado com distinção!")
        media >= 7.0 -> println("Aprovado!")
        else -> println("Reprovado")
    }
}*/

//20- Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário o valor do saque e depois informar
// quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais.
// O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas existentes na máquina.
//Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 5 e uma nota de 1;
//Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.

/*fun main(){
    print("Qual valor a ser sacado? > ")
    var saque = readln().toInt()

    if(saque in 10..600){
        val nota100 = saque / 100
        saque -= nota100 * 100
        val nota50 = saque / 50
        saque -= nota50 * 50
        val nota10 = saque / 10
        saque -= nota10 * 10
        val nota5 = saque / 5
        saque -= nota5 * 5
        println("Notas 100: $nota100\nNotas 50: $nota50\nNotas 10: $nota10\nNotas 5: $nota5\nNotas 1: $saque")

    }
    else println("Valor invalido")
}*/

//21- Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo (resto da divisão).
/*fun main(){
    print("Digite um numer > ")
    val num = readln().toInt()
    println(if(num % 2 == 0)"Par" else "Impar")
}*/

//22- Faça um Programa que peça um número e informe se o número é inteiro ou decimal. Dica: utilize uma função de arredondamento.
/*fun main(){
    print("Digite um numero: ")
    val num = readln().toDouble()
    if(num % 2 == 0.0){
        println("inteiro")
    }
    else println("Decimal")
}*/

//23- Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
// O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
//par ou ímpar;
//positivo ou negativo;
//inteiro ou decimal.
/*fun main(){
    print("Digite o primeiro numero > ")
    val num1 = readln().toDouble()
    print("Digite o segundo numero >")
    val num2 = readln().toDouble()
    print("Digite qual expressão deseja:\npar ou ímpar\npositivo ou negativo\ninteiro ou decimal\n>")
    val option = readln()
    when(option){
        "par ou ímpar" -> {
            println("$num1 é ${if(num1 % 2 == 0.0)"par" else "Impar"}")
            println("$num2 é ${if(num2 % 2 == 0.0)"par" else "Impar"}")
        }
        "positivo ou negativo" -> {
            println("$num1 é ${if(num1 >= 0.0)"positivo" else "negativo"}")
            println("$num2 é ${if(num2 >= 0.0)"positivo" else "negativo"}")
        }
        "inteiro ou decimal" -> {
            println("$num1 é ${if(num1 % 2 == 0.0)"inteiro" else "decimal"}")
            println("$num2 é ${if(num2 % 2 == 0.0)"inteiro" else "decima"}")
        }
        else -> println("Valor invalido!!")
    }
}*/

//24- Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//"Telefonou para a vítima?"
//"Esteve no local do crime?"
//"Mora perto da vítima?"
//"Devia para a vítima?"
//"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
// Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
// e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

/*fun main(){
    var count = 0
    println("Telefonou para a vítima? 1- sim 2- não")
    var tent = readln().toInt()
    count += if(tent == 1) 1 else 0
    println("Esteve no local do crime? 1- sim 2- não")
    tent = readln().toInt()
    count += if(tent == 1) 1 else 0
    println("Mora perto da vítima? 1- sim 2- não")
    tent = readln().toInt()
    count += if(tent == 1) 1 else 0
    println("Devia para a vítima? 1- sim 2- não")
    tent = readln().toInt()
    count += if(tent == 1) 1 else 0
    println("Já trabalhou com a vítima? 1- sim 2- não")
    tent = readln().toInt()
    count += if(tent == 1) 1 else 0

    if(count == 2) println("Suspeita")
    else if(count == 3 || count == 4) println("Cúmplice")
    else if(count == 5) println("Assassino")
    else println("Inocente")

}*/

//25- Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//Álcool:
//até 20 litros, desconto de 3% por litro
//acima de 20 litros, desconto de 5% por litro
//Gasolina:
//até 20 litros, desconto de 4% por litro
//acima de 20 litros, desconto de 6% por litro
// Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível
// (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago
// pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.

/*fun main(){
    print("Qual tipo de combustivel deseja abastecer? A- Alcool G- Gasolina\n>> ")
    val tipo = readln()[0]
    print("quantos litros deseja abastecer?\n>> ")
    val quantidade = readln().toInt()

    when(tipo){
        'a', 'A' -> println("Valor a pagar: R$ ${1.90 * quantidade * if(quantidade > 20) 0.95 else 0.97}")
        'g', 'G' -> println("Valor a pagar: R$ ${2.50 * quantidade * if(quantidade > 20) 0.94 else 0.96}")
    }
}*/

//26- Uma fruteira está vendendo frutas com a seguinte tabela de preços:
//                      Até 5 Kg           Acima de 5 Kg
//Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
//Maçã            R$ 1,80 por Kg          R$ 1,50 por Kg
//Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
// receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos
// e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
/*fun main(){
    print("quantos quilos de morango deseja comprar\n>>")
    val morangos = readln().toInt()
    print("quantos quilos de maçãs deseja comprar\n>>")
    val macas = readln().toInt()
    var total = 0.0
    total += if(morangos > 5) 2.20 * morangos else 2.50 * morangos
    total += if(macas > 5) 2.20 * macas else 2.50 * macas
    if(total > 25.0 || macas + morangos > 8){
        total *= 0.90
    }
    println(String.format("Valor a pagar: R\$ %.2f", total))

}*/

//27- O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
//                      Até 5 Kg           Acima de 5 Kg
//File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
//Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
//Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
//Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção,
// porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o
// cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e a
// quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e
// quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.

/*fun main() {
    print("Digite qual carne voce deseja: \n1 - Filé duplo\n2- Alcatra\n3- Picanha\n>> ")
    val opcao = readln().toInt()
    print("Digite quantos quilos deseja comprar\n>> ")
    val quantidade = readln().toInt()
    print("Irá utiliza os cartões tabajara? 1- sim 2- não\n>> ")
    val cartao = readln().toInt()
    val tipoPagamento = if (cartao == 1) "Cartão Tabajara" else "outro metodo de pagamento"
    val desconto = if (cartao == 1) 5 else 0
    var tipoCarne = ""
    var total = 0.0
    when (opcao) {
        1 ->  {total = if (quantidade > 5) 5.80 * quantidade else 4.90 * quantidade; tipoCarne = "Filé Duplo"}
        2 ->  {total = if (quantidade > 5) 6.80 * quantidade else 5.90 * quantidade * 0.95; tipoCarne = "Alcatra"}
        3 ->  {total = if (quantidade > 5) 7.80 * quantidade else 6.90 * quantidade * 0.95; tipoCarne = "Picanha"}
        else -> println("Valor Invalido!")
        }

    println(
        String.format(
            """carne: %s
                |quantidade: %d KG
                |valor Total: R$ %.2f
                |Tipo de pagamento: %s
                |valor do desconto: %d %% 
                |Valor a pagar: R$ %.2f""".trimMargin(),
            tipoCarne,
            quantidade,
            total,
            tipoPagamento,
            desconto,
            (total * (1.0 - desconto / 100.0))
        )
    )
}*/
