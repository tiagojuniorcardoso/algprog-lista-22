public class Sistema {
    public static void main( String[]args){
        Veiculo carro = new Carro("Honda" , "Civic", 2022);
        Veiculo moto = new Moto ("Yamaha" , "MT-07" , 2021);
        Veiculo caminhao= new Caminhao ("Volvo", "FH 540", 2020);

        
        carro.acelerar();
        System.out.println();

        moto.acelerar();
        System.out.println();

        caminhao.acelerar();
        System.out.println();
        
        
    }
    
}
