class Main {
    public static void main(String args[]) {
        // Pimera parte del ejercicio
        int numeroif = 0;

        if(numeroif >= 0){
            System.out.println("El numero es positivo");   
        }
        else if(numeroif == 0){
            System.out.println("El numero es cero");
        }else{
            System.out.println("El numero es negativo");
        }

        // Segunda parte del ejercicio
        int numeroWhile = 0;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        int numerodoWhile = 0;
        do{
            numerodoWhile++;
            System.out.println(numerodoWhile);
        } while(numerodoWhile > 1);
        
        //Tercera parte del ejercicio

        int numeroFor = 0;

        for(int i = 0; i < 3; i++){
            numeroFor++;
            System.out.println(numeroFor);
        }
        //Cuarta parte del ejercicio
        String estacion = "Nada";

        switch(estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("La variable no es una estación");
        }
    }    
}