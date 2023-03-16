public class Pizza {

    private int tipoMasa;
    private int size;
    private boolean rellena;
    private boolean cebolla;
    private boolean sinGluten;
    private int recojida;

    private int tipoSalsa;
    private boolean extraQueso;
    private boolean pina;
    private boolean champis;
    private boolean jamon;

    // tipo de masa
    public static final int FINA = 0;
    public static final int PAN = 1;

    // tamaño de la pizza
    public static final int SMALL = 0;
    public static final int MEDIUM = 2;
    public static final int BIG = 3;

    // recojida
    public static final int TIENDA = 0;
    public static final int PARALLEVAR = 1;

    // salsa
    public static final int BARBACOA = 0;
    public static final int TOMATE = 1;
    public static final int SIN_GLUTEN = 3;

    public Pizza(){
        this.cebolla = true;
        this.recojida = TIENDA;
        this.rellena = false;
        this.sinGluten = false;
        this.size = MEDIUM;
        this.tipoMasa = FINA;
        this.tipoSalsa = TOMATE;
        this.extraQueso = true;
        this.pina = false;
        this.champis = true;
        this.jamon = false;
    }

    /**
     * Constructor con todoa los parametros
     * @param tipoMasa espesor de la masa
     * @param size tamaño de la pizza
     * @param rellena si el borde esta relleno de queso
     * @param cebolla lleva o no lleva
     * @param sinGluten para celíacos
     * @param recojida como lo va a recoger el cliente
     * @param tipoSalsa salsa de la pizza
     * @param extraQueso si tiene más queso
     * @param pina si tiene o no piña
     * @param champis si tiene champiñones o no
     * @param jamon si tiene jamon o no
     */
    public Pizza(int tipoMasa, int size, boolean rellena, boolean cebolla, boolean sinGluten, int recojida, int tipoSalsa, boolean extraQueso, boolean pina, boolean champis, boolean jamon) {
        this.tipoMasa = tipoMasa;
        this.size = size;
        this.rellena = rellena;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.recojida = recojida;
        this.tipoSalsa = tipoSalsa;
        this.extraQueso = extraQueso;
        this.pina = pina;
        this.champis = champis;
        this.jamon = jamon;
    }

    public int getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(int tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isRellena() {
        return rellena;
    }

    public void setRellena(boolean rellena) {
        this.rellena = rellena;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public int getRecojida() {
        return recojida;
    }

    public void setRecojida(int recojida) {
        this.recojida = recojida;
    }

    public int getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(int tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    public boolean getExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean getPina() {
        return pina;
    }

    public void setPina(boolean pina) {
        this.pina = pina;
    }

    public boolean getChampis() {
        return champis;
    }

    public void setChampis(boolean champis) {
        this.champis = champis;
    }

    public boolean getJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "tipoMasa=" + tipoMasa +
                ", size=" + size +
                ", rellena=" + rellena +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", recojida=" + recojida +
                ", tipoSalsa=" + tipoSalsa +
                ", extraQueso=" + extraQueso +
                ", piña=" + pina +
                ", champiñones=" + champis +
                ", jamon=" + jamon +
                '}';
    }
}