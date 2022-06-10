package chapter07;

class Box {

    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        System.out.println("Create new box ");
        width  = w;
        height = h;
        depth  = d;
    }

    Box(){
        System.out.println("Create new empty box ");
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(Box ob){
        System.out.println("Create based on another object ");
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(double a){
        System.out.println("Create new cube (double) ");
        width = height = depth = a;
    }

    Box(int a){
        System.out.println("Create new cube (integer) ");
        width = height = depth = a;
    }

    void volume(){
        System.out.println("Volume box = " + width * height * depth);
    }

    double volume2(){
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo{

    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box(5,5,5);
        Box mycube1 = new Box(12);
        Box mycube2 = new Box(12.5);

        Box mybox3 = new Box(mybox2);

        System.out.println("mybox1: w = " + mybox1.width + ", h = " + mybox1.height + ", d = " + mybox1.depth);
        System.out.println("mybox2: w = " + mybox2.width + ", h = " + mybox2.height + ", d = " + mybox2.depth);
        System.out.println("mycube1: w = " + mycube1.width + ", h = " + mycube1.height + ", d = " + mycube1.depth);
        System.out.println("mycube2: w = " + mycube2.width + ", h = " + mycube2.height + ", d = " + mycube2.depth);
        System.out.println("mybox3: w = " + mybox3.width + ", h = " + mybox3.height + ", d = " + mybox3.depth);

    }
}