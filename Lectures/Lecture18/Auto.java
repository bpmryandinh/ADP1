public class Auto {
    private String _model;
    private int milesDriven;
    private double gallonsOfGas;

    public Auto() {
        this._model = "NA";
        this.milesDriven = 0;
        this.gallonsOfGas = 0.0;
    }

    public Auto(String _model, int milesDriven, double gallonsOfGas) {
        this._model = _model;
        this.milesDriven = milesDriven;
        this.gallonsOfGas = gallonsOfGas;
    }

    public String getModel() {
        return this._model;
    }

    public void setModel(String model) {
        this._model = model;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    public void setGallonsOfGas(double gallonsOfGas) {
        this.gallonsOfGas = gallonsOfGas;
    }

    
}