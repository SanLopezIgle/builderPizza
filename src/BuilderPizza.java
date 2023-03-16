public class BuilderPizza {

        // este es el objeto que va a construir nuestro Builder
        // utilizamos el guion bajo para remarcar que es un objeto de esta clase
        private Pizza _pizza; // tambien podemos poner protected

        // metodo que devuelve el objeto terminado
        public Pizza build() {
            return this._pizza;
        }

        // crea la pizza para configurarla
        public BuilderPizza() {
            _pizza = new Pizza();
        }

        // metodos para la personalizacion de la pizza
        public BuilderPizza setTipoMasa(int tipoMasa) {
            _pizza.setTipoMasa(tipoMasa);
            return this;
        }

        public BuilderPizza setSize(int size) {
            _pizza.setSize(size);
            return this;
        }

        public BuilderPizza setRelleno(boolean relleno) {
            _pizza.setRellena(relleno);
            return this;
        }

        public BuilderPizza setCebolla(boolean cebolla) {
            _pizza.setCebolla(cebolla);
            return this;
        }

        public BuilderPizza setSinGluten(boolean sinGluten){
            _pizza.setSinGluten(sinGluten);
            return this;
        }

        public BuilderPizza setRecojida(int recojida) {
            _pizza.setRecojida(recojida);
            return this;
        }

        public BuilderPizza setTipoSalsa(int tipoSalsa) {
            _pizza.setTipoSalsa(tipoSalsa);
            return this;
        }

        public BuilderPizza setExtraQueso(boolean extraQueso) {
            _pizza.setExtraQueso(extraQueso);
            return this;
        }

        public BuilderPizza setPina(boolean pina){
            _pizza.setPina(pina);
            return this;
        }

        public BuilderPizza setChampis(boolean champis){
            _pizza.setChampis(champis);
            return this;
        }

        public BuilderPizza setJamon(boolean jamon){
            _pizza.setJamon(jamon);
            return this;
        }
}
