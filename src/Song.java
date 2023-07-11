public class Song {
    public static void getVerse1() {
        System.out.println("Bought me a cat and the cat pleased me,");
        System.out.println("I fed my cat under yonder tree.");
    }

    public static void getVerse2() {
        System.out.println("Bought me a hen and the hen pleased me,");
        System.out.println("I fed my hen under yonder tree.");
    }

    public static void getVerse3() {
        System.out.println("Bought me a duck and the duck pleased me,");
        System.out.println("I fed my duck under yonder tree.");
    }

    public static void getVerse4() {
        System.out.println("Bought me a goose and the goose pleased me,");
        System.out.println("I fed my goose under yonder tree.");
    }

    public static void getVerse5() {
        System.out.println("Bought me a sheep and the sheep pleased me,");
        System.out.println("I fed my sheep under yonder tree.");
    }

    public static void getVerse6() {
        System.out.println("Bought me a pig and the pig pleased me,");
        System.out.println("I fed my pig under yonder tree.");
    }

    public static void getCatSound() {
        System.out.println("Cat goes fiddle-i-fee.");
        System.out.println();
    }

    public static void getHenSound() {
        System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
        getCatSound();
    }

    public static void getDuckSound() {
        System.out.println("Duck goes quack, quack,");
        getHenSound();
    }

    public static void getGooseSound() {
        System.out.println("Goose goes hissy, hissy,");
        getDuckSound();
    }

    public static void getSheepSound() {
        System.out.println("Sheep goes baa, baa,");
        getGooseSound();
    }

    public static void getPigSound() {
        System.out.println("Pig goes oink, oink,");
        getSheepSound();
    }
    
    public static void main (String args[]) {
        getVerse1();
        getCatSound();
        getVerse2();
        getHenSound();
        getVerse3();
        getDuckSound();
        getVerse4();
        getGooseSound();
        getVerse5();
        getSheepSound();
        getVerse6();
        getPigSound();
    }
}
