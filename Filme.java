class Filme {
    private String titulo;
    private int ano;
    private int tipo;

    public void setTitulo(String t){
      titulo = t;
    }
    public void setAno(int a){
      ano = a;
    }
    public void setTipo(int t){
      tipo = t;
    }

    public String getTitulo(){
      return titulo;
    }

    public int getAno(){
      return ano;
    }

    public int getTipo(){
      return tipo;
    }
}