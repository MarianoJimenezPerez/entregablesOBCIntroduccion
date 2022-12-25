public class Main {
    public static void main(String[] args) {
        int numeroIf = 1;
        int numeroWhile = 0;
        var estacion = "VERANO";

        if(numeroIf == 0){
            System.out.println("Es igual a cero");
        } else if (numeroIf > 0) {
            System.out.println("Es mayor a cero");
        } else{
            System.out.println("Es menor a cero");
        }

        while (numeroWhile < 3){
            System.out.println("Numero while es: " + numeroWhile);
            numeroWhile++;
        }


        do{
            numeroWhile++;
            System.out.println("Inicia doWhile. Ahora while es: " + numeroWhile);
        } while (numeroWhile < 3);

        for (int i = 0; i <= 3; i++){
            System.out.println("Bucle for. El valor de i es: " + i);
        }


        switch (estacion){
            case("VERANO"):
                System.out.println("La variable estacion esta seteada como verano");
                break;
            case("OTOÑO"):
                System.out.println("La variable estacion esta seteada como otoño");
                break;
            case("INVIERNO"):
                System.out.println("La variable estacion esta seteada como invierno");
                break;
            case("PRIMAVERA"):
                System.out.println("La variable estacion esta seteada como primavera");
                break;
            default:
                System.out.println("La variable estacion no esta seteada correctamente. Recuerda utilizar mayuscula para definir la estacion");
        }
    }
}