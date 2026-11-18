public abstract class Veiculo{
public String marca;
public String modelo;
public int ano;

public Veiculo(String marca,String modelo,int ano){
    this.marca=marca;
    this.modelo=modelo;
    this.ano=ano;

}
public void exibirDetalhes(){
    System.out.println("marca" + marca);
    System.out.println("modelo" + modelo);
    System.out.println("ano" +  ano);

}
public abstract void acelerar();

}