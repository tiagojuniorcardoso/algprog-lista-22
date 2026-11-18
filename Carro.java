public class Carro extends Veiculo {
    public Carro (String marca, String modelo , int ano  ){
   super(marca,modelo,ano);

    }
    public void acelerar(){
        System.out.println(modelo +"" + marca + "esta acelerando de 0 a 100km/h em 5segundos");

    }
}
