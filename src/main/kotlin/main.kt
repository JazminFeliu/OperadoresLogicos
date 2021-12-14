fun main(args: Array<String>) {
    //confeccionar un programa que lea por teclado tres numeros y muestre el mayor
    print("Ingrese el primer valor: ")
    val valor1 = readLine()!!.toInt()

    print("Ingrese el segundo valor: ")
    val valor2 = readLine()!!.toInt()

    print("Ingrese el tercer valor: ")
    val valor3 = readLine()!!.toInt()

    if(valor1 > valor2 && valor1 > valor3)
        println("El mayor valor es $valor1")
    else if(valor2 > valor3)
        println("El mayor valor es $valor2")
    else
        println("El mayor valor es $valor3")

    //se carga fecha(dia, mes y año) por teclado. Mostrar un mensaje si corresponde al primer trimestre del año

    print("Ingrese el dia: ")
    val dia = readLine()!!.toInt()
    print("Ingrese el mes: ")
    val mes = readLine()!!.toInt()
    print("Ingrese el año: ")
    val anio = readLine()!!.toInt()
    if(mes == 1 || mes == 2 || mes == 3)
        println("la fecha es del primer trimestre" )
}