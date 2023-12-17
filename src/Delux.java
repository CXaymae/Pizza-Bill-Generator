public class Delux extends  Pizza{
    public Delux(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraTopins();
    }

    //Disable the option of adding cheese and topins as these are part of default characrteristics of this type of pizza
    @Override
    public void addExtraCheese() {}

    @Override
    public void addExtraTopins() {}
}
