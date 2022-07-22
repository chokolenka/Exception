package com.company;

// Outer Builder  строитель
public class ThreeLittlePigs {
    public static void main(String[] args) {
        Director director = new Director();
        Builder nifnif = new NifNif();
        Builder nafnaf = new NafNaf();
        Builder nufnuf = new NufNuf();

        director.setBuilder(nufnuf);
        director.getBuilder().buildBase();
        director.setBuilder(nifnif);
        director.getBuilder().buildWalls();
        director.setBuilder(nafnaf);
        director.getBuilder().buildRoof();
        director.setBuilder(nufnuf);
        director.buildHouse();
    }
}
interface Builder{
    void buildBase();
    void buildWalls();
    void buildRoof();
}
class NifNif implements Builder{

    @Override
    public void buildBase() {
        System.out.println("I build the soil base");
    }

    @Override
    public void buildWalls() {
        System.out.println("I build the clay walls");

    }

    @Override
    public void buildRoof() {
        System.out.println("I build the straw roof");
    }
}
class NafNaf implements Builder{

    @Override
    public void buildBase() {
        System.out.println("I build the sand base");
    }

    @Override
    public void buildWalls() {
        System.out.println("I build the stick walls");

    }

    @Override
    public void buildRoof() {
        System.out.println("I build the leaves roof");
    }
}
class NufNuf implements Builder{

    @Override
    public void buildBase() {
        System.out.println("I build the concrete base");
    }

    @Override
    public void buildWalls() {
        System.out.println("I build the stone walls");

    }

    @Override
    public void buildRoof() {
        System.out.println("I build the tile roof");
    }
}

class Director{
    public Builder getBuilder() {
        return builder;
    }

    private Builder builder;

    public void setBuilder (Builder builder) {
        this.builder = builder;
    }
    public void buildHouse(){
        // обращается и говорит - сначала построй ...
        builder.buildBase();
        builder.buildWalls();
        builder.buildRoof();

    }
}

