println("Bienvenido al sistema de Transacciones.")
println("Elija el tipo de Transaccion")

println("1. Pago ENEE")
println("2. Pago SANAA")
println("3. Recargas y Super Recargas Tigo")
println("4. Recargas y Super Recargas Claro")
println("5. Retiros")
println("6. Depositos")
println("7. Salir")
var opcionMenu= readLine()!!.toInt()

when(opcionMenu) {
    1->{
            var account1 = Servicio()
            var contador: Int
            var cantidad: Double
            var dni: Long
            var str: String
            var len: Int
            var cuenta: Int
            do {
                println("Ingrese el DNI de el Cliente: ")
                dni = readLine().toString().toLong()
                str = dni.toString()
                len = str.length
                println("Ingrese la Cuenta en la que desea cancelar el saldo de su factura de la ENEE: ")
                cuenta = readLine().toString().toInt()
                println("Ingrese la cantidad que desea Cancelar: ")
                cantidad = readLine().toString().toDouble()
                if (len == 13 || len == 12) {
                    account1.deposit(dni, cuenta, cantidad)
                    println("El Balance se ha cancelado con exito! La transaccion realizada es: ")
                    account1.displayTransaction()
                } else {
                    println("La DNI ingresada es invalida. Por Favor ingrese una DNI que contenga 13 digitos.")
                }
                println("Desea realizar otra Transaccion de Pago de ENEE? | 0 = No | - | 1 = Si |")
                contador = readLine().toString().toInt()
            } while (contador != 0)
            println("Gracias por Utilizar nuestro Servicio. Buen Dia.")


    }
    2->{
        var account1 = Servicio()
        var contador: Int
        var cantidad: Double
        var dni: Long
        var str: String
        var len: Int
        var cuenta: Int
        do {
            println("Ingrese el DNI de el Cliente: ")
            dni = readLine().toString().toLong()
            str = dni.toString()
            len = str.length
            println("Ingrese la Cuenta en la que desea cancelar el saldo de su factura de el SANAA: ")
            cuenta = readLine().toString().toInt()
            println("Ingrese la cantidad que desea Cancelar: ")
            cantidad = readLine().toString().toDouble()
            if (len == 13 || len == 12) {
                account1.deposit(dni, cuenta, cantidad)
                println("El Balance se ha cancelado con exito! La transaccion realizada es: ")
                account1.displayTransaction()
            } else {
                println("La DNI ingresada es invalida. Por Favor ingrese una DNI que contenga 13 digitos.")
            }
            println("Desea realizar otra Transaccion de Pago de SANAA? | 0 = No | - | 1 = Si |")
            contador = readLine().toString().toInt()
        } while (contador != 0)
        println("Gracias por Utilizar nuestro Servicio. Buen Dia.")
        
    }
    3->{
        println("Bienvenido al sistema de recargas TIGO")
        println("Ingrese el numero de celular al que desea aplicar la recarga")

        var cel= readLine().toString()
        println("El número de telefono ingresado es $cel")
        println("Elija el tipo de recarga")

        println("1. Recarga normal")
        println("2. Super Recarga")
        println("3. Paquetigos")
        println("4. Salir")
        var opMenu= readLine()!!.toInt()

        when(opMenu){
            1->{
                println("Seleccione el valor de la Recarga")
                println("1. 25")
                println("2. 50")
                println("3. 100")
                println("4. Salir")
                var opcionRecarga= readLine()!!.toInt()
                when(opcionRecarga){
                    1 ->{
                        println("Recarga de 25 aplicada con éxito")
                        println("Gracias por utilizar el servicio de recargas Tigo")
                    }

                    2 ->{
                        println("Recarga de 50 aplicada con éxito")
                        println("Gracias por utilizar el servicio de recargas Tigo")
                    }

                    3 ->{
                        println("Recarga de 100 aplicada con éxito")
                        println("Gracias por utilizar el servicio de recargas Tigo")
                    }

                    4 ->{
                        println("Gracias por utilizar el servicio de recargas Tigo")
                    }
                }

            }
            2->{
                println("Seleccione el valor de la super Recarga")
                println("1. 25 1d 1GB+Llamadas+SMS")
                println("2. 50 3d 4GB+Wha+FB+LLamadas+SMS")
                println("3. 100 7d 10GB+Wha+FB+LLamadas+SMS")
                println("4. Salir")
                var opcionSuperRecarga= readLine()!!.toInt()
                when(opcionSuperRecarga){
                    1 ->{
                        println("super Recarga de 25 aplicada con éxito")
                        println("Gracias por utilizar el servicio de recargas Tigo")
                    }

                    2 ->{
                        println("superRecarga de 50 aplicada con éxito")
                        println("Gracias por utilizar el servicio de recargas Tigo")
                    }

                    3 ->{
                        println("super Recarga de 100 aplicada con éxito")
                        println("Gracias por utilizar el servicio de recargas Tigo")
                    }

                    4 ->{
                        println("Gracias por utilizar el servicio de recargas Tigo")
                    }
                }

            }
            3->{
                println("Seleccione el Paquetigo que desee")
                println("1. 1.5GB+Llamadas 1d - 50 lps")
                println("2. Whatsapp Ilimitado 1d - 15 lps")
                println("3. Facebook Ilimitado 1d - 15 lps")
                println("4. Salir")
                var opcionPaquetigo= readLine()!!.toInt()
                when(opcionPaquetigo){
                    1 ->{
                        println("Paquete 1.5GB+Llamadas 1d aplicado con éxito")
                        println("Gracias por utilizar el servicio de recargas Tigo")
                    }

                    2 ->{
                        println("Paquete Whatsapp Ilimitado aplicado con éxito")
                        println("Gracias por utilizar el servicio de recargas Tigo")
                    }

                    3 ->{
                        println("Paquete Facebook Ilimitado aplicado con éxito")
                        println("Gracias por utilizar el servicio de recargas Tigo")
                    }

                    4 ->{
                        println("Gracias por utilizar el servicio de recargas Tigo")
                    }
                }

            }
            4->{
                println("Gracias por utilizar el servicio de recargas Tigo")
            }
        }
    }
    4->{
        println("Bienvenido al sistema de recargas Claro")
        println("Ingrese el numero de celular al que desea aplicar la recarga")

        var cel= readLine().toString()
        println("El número de telefono ingresado es $cel")
        println("Elija el tipo de recarga")

        println("1. Recarga normal")
        println("2. Super Recarga")
        println("3. SuperPacks")
        println("4. Salir")
        var opMen= readLine()!!.toInt()

        when(opMen){
            1->{
                println("Seleccione el valor de la Recarga")
                println("1. 25")
                println("2. 50")
                println("3. 100")
                println("4. Salir")
                var opcionRecarga= readLine()!!.toInt()
                when(opcionRecarga){
                    1 ->{
                        println("Recarga de 25 aplicada con éxito")
                        println("Gracias por utilizar el servicio de recargas Claro")
                    }

                    2 ->{
                        println("Recarga de 50 aplicada con éxito")
                        println("Gracias por utilizar el servicio de recargas Claro")
                    }

                    3 ->{
                        println("Recarga de 100 aplicada con éxito")
                        println("Gracias por utilizar el servicio de recargas Claro")
                    }

                    4 ->{
                        println("Gracias por utilizar el servicio de recargas Claro")
                    }
                }

            }
            2->{
                println("Seleccione el valor de la super Recarga")
                println("1. 25 1d 1GB+Llamadas+SMS")
                println("2. 50 3d 4GB+Wha+FB+LLamadas+SMS")
                println("3. 100 7d 10GB+Wha+FB+LLamadas+SMS")
                println("4. Salir")
                var opcionSuperRecarga= readLine()!!.toInt()
                when(opcionSuperRecarga){
                    1 ->{
                        println("super Recarga de 25 aplicada con éxito")
                        println("Gracias por utilizar el servicio de recargas Claro")
                    }

                    2 ->{
                        println("superRecarga de 50 aplicada con éxito")
                        println("Gracias por utilizar el servicio de recargas Claro")
                    }

                    3 ->{
                        println("super Recarga de 100 aplicada con éxito")
                        println("Gracias por utilizar el servicio de recargas Claro")
                    }

                    4 ->{
                        println("Gracias por utilizar el servicio de recargas Claro")
                    }
                }

            }
            3->{
                println("Seleccione el Super Pack que desee")
                println("1. 1.5GB+Llamadas 1d - 50 lps")
                println("2. Whatsapp Ilimitado 1d - 15 lps")
                println("3. Facebook Ilimitado 1d - 15 lps")
                println("4. Salir")
                var opcionSuperPacks= readLine()!!.toInt()
                when(opcionSuperPacks){
                    1 ->{
                        println("Paquete 1.5GB+Llamadas 1d aplicado con éxito")
                        println("Gracias por utilizar el servicio de recargas Claro")
                    }

                    2 ->{
                        println("Paquete Whatsapp Ilimitado aplicado con éxito")
                        println("Gracias por utilizar el servicio de recargas Claro")
                    }

                    3 ->{
                        println("Paquete Facebook Ilimitado aplicado con éxito")
                        println("Gracias por utilizar el servicio de recargas Claro")
                    }

                    4 ->{
                        println("Gracias por utilizar el servicio de recargas Claro")
                    }
                }

            }
            4->{
                println("Gracias por utilizar el servicio de recargas Claro")
            }
        }
    }
    5->{
        var account1 = Retiro()
        var contador: Int
        var cantidad: Double
        var cuenta: Int
        do{
            println("Ingrese la Cuenta de la que desea realizar el Retiro: ")
            cuenta= readLine().toString().toInt()
            println("Ingrese la cantidad que desea Retirar: ")
            cantidad= readLine().toString().toDouble()
            if (cantidad<=5000 && cantidad> 0){
                account1.deposit(cuenta,cantidad)
                println("El Retiro se ha realizado con exito! La transaccion realizada es: ")
                account1.displayBalance()
            }else{
                println("La Cantidad Ingresada es Invalida. Por favor ingresar una cantidad entre 0.00 y 5000")
            }
            println("Desea realizar otro Retiro? | 0 = No | - | 1 = Si |")
            contador= readLine().toString().toInt()
        }while(contador!=0)
        println("Gracias por Utilizar nuestro Servicio. Buen Dia.")
    }
    6->{
        var account1 = Deposito()
        var contador: Int
        var cantidad: Double
        var cuenta: Int
        do{
            println("Ingrese la Cuenta a la que le desea hacer el deposito: ")
            cuenta= readLine().toString().toInt()
            println("Ingrese la cantidad que desea depositar: ")
            cantidad= readLine().toString().toDouble()
            if (cantidad<=10000 && cantidad> 0){
                account1.deposit(cuenta,cantidad)
                println("El deposito se ha realizado con exito! La transaccion realizada es: ")
                account1.displayBalance()
            }else{
                println("La Cantidad Ingresada es Invalida. Por favor ingresar una cantidad entre 0.00 y 10000")
            }
            println("Desea realizar otro deposito? | 0 = No | - | 1 = Si |")
            contador= readLine().toString().toInt()
        }while(contador!=0)
        println("Gracias por Utilizar nuestro Servicio. Buen Dia.")
    }
    7->{
        println("Gracias por utilizar el servicio de Transacciones")
    }
}

class Servicio{
    var accountNumber: Int = 0
    var idNumber: Long = 0
    var balance: Double = 0.00

    fun deposit(account: Long, number: Int, amount: Double) {
        idNumber = account
        accountNumber = number
        balance = amount
    }

    fun displayTransaction() {
        println("DNI del Cliente: $idNumber")
        println("Numero de Cuenta Cancelada: $accountNumber")
        println("Cantidad Cancelada: $balance")

    }
}

class Retiro {
    var accountNumber: Int =0
    var balance: Double = 0.00

    fun deposit(number: Int, amount: Double) {
        accountNumber = number
        balance = amount
    }

    fun displayBalance(){
        println("Numero de Cuenta Debitado: $accountNumber")
        println("Cantidad Retirada: $balance")

    }
}
class Deposito {
    var accountNumber: Int =0
    var balance: Double = 0.00

    fun deposit(number: Int, amount: Double) {
        accountNumber = number
        balance = amount
    }

    fun displayBalance(){
        println("Numero de Cuenta Acreditado: $accountNumber")
        println("Cantidad Depositada: $balance")

    }
}
