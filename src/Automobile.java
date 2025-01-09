//definizione della classe
public class Automobile {

    //campi (o attributi o stati)

    //private [static] [final] tipoCampo nomeCampo;
    private String modello;
    private String colore;
    private String targa;
    private double benzina;
    private final double capacitaSerbatoio;
    private final int capacitaPasseggeri;
    private String[] passeggeri;
    private int numeroPasseggeri; //contatore degli attuali passeggeri seduti in automobile

    //proviamo a integrare la gestione di una array di passeggeri (nome - stringa)


    //metodi (i costruttori)
    public Automobile(String m, double capacitaSerbatoio, int maxPasseggeri) {
        //inizializzare i valori (campi) dell oggetto
        //non ha MAI un return (non ha un void)
        this.modello = m;
        this.capacitaSerbatoio = capacitaSerbatoio;
        this.capacitaPasseggeri = maxPasseggeri;
        this.passeggeri = new String[capacitaPasseggeri];
        this.numeroPasseggeri = 0; //contatore di comodità, non strettamente necessario
    }

    //posso avere più costruttori, che differiscono per signature
    public Automobile(String modello, String colore, String targa, double capacitaSerbatoio, int maxPasseggeri) {
        this.modello = modello;
        this.colore = colore;
        this.targa = targa;
        this.capacitaSerbatoio = capacitaSerbatoio;
        this.capacitaPasseggeri = maxPasseggeri;
        this.passeggeri = new String[capacitaPasseggeri];
        this.numeroPasseggeri = 0;
    }

    //intestazione del metodo (signature)
    public String getModello() {
        //corpo del metodo
        return this.modello;
    }

    //metodo getter che restituisce un parametro privato targa
    public String getTarga() {
        return this.targa;
    }

    public String getColore() {
        return this.colore;
    }

    public double getBenzina() {
        return this.benzina;
    }

    public void setBenzina(double litri) {
        //come gestisco il limite del mio serbatoio?
        /*
        *   capacità del mio serbatoio 45
        *   ho attualmente 10 litri
        *   provo a metterne 50
        *   10 +50 > 45 ? SI
        *   quindi metto benzina pari alla capacità del serbatoio = 45
         */
        if((this.benzina + litri) > this.capacitaSerbatoio) {
            this.benzina = this.capacitaSerbatoio;
            System.out.println("Stai mettendo più benzina della capacità, mi fermo al pieno");
        }
        else {
            this.benzina += litri;
            System.out.println("Rifornimento effettuato, attualmente hai "+ this.benzina + " litri");
        }
    }

    //getter dei passeggeri
    public String[] getPasseggeri() {
        return this.passeggeri;
    }

    //aggiungere un passeggero
    public void aggiungiPasseggero(String nomePass) {
        if(numeroPasseggeri < capacitaPasseggeri) {
            //posso farti salire a bordo
            passeggeri[numeroPasseggeri] = nomePass;
            numeroPasseggeri++;
            System.out.println("Passeggero " + nomePass + " welcome on board!");
        }
        else {
            System.out.println("Mi dispiace, la macchina è al completo!");
        }
    }


    //rimuovere un passeggero
    public void rimuoviPasseggero() {

    }


}
