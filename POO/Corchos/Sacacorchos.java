public class Sacacorchos {
    boolean tieneCorcho = false;

    public boolean gettieneCorcho() {
        return tieneCorcho;
    }

    public void destapar(Botella botella) {
        if (!gettieneCorcho()) {
            if (botella.corcho.getEnBotella()) {
                botella.corcho.setEnBotellaFalse();
                this.tieneCorcho = true;
                System.out.println("Se ha quitado el corcho de la botella");
            } else {
                System.out.println("La botella ya esta destapada");
            }
        } else {
            System.out.println("El sacacorcho ya tiene un corcho");
        }
    }
    public void limpiar(){
        if(gettieneCorcho()){
            this.tieneCorcho = false;
            System.out.println("Se ha quitado el corcho");
        }else{
            System.out.println("El sacacorcho no tiene corcho");
        }
    }
}
