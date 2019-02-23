public class Main {

    public static void main(String[] args) {
        PRYAMOYGOLNIK S = new PRYAMOYGOLNIK(3, 6);
        System.out.println("Периметр прямоугольника " + S.getarea());
        System.out.println("Площадь прямоугольника " + S.getVolume());
        SFERA SS = new SFERA(3, 6, 8);
        System.out.println("Радиус сферы " + SS.getRadiuss());
        System.out.println("Площадь сферы " + SS.getareas());
        System.out.println("Объем сферы " + SS.getVolumes());
        TREYGOLNIK t = new TREYGOLNIK(2,4,4);
        System.out.println("Периметр треугольника "+t.getVolumee());
        System.out.println("Площадь треугольника "+t.area());
        OKR o = new OKR(5);
        System.out.println("Длина окружности "+o.dlina());
        System.out.println("Площадь окружности "+o.plo());
        PARALELIPIP p = new PARALELIPIP(4,2,16);
        System.out.println("Диагональ параллелепипеда "+p.diag());
        System.out.println("Объем параллелепипеда "+p.ob());
        System.out.println("Площадь параллелепипеда "+p.plo());
        CILI c= new CILI(10,3);
        System.out.println("Площаль основания цилиндра "+c.plosn());
        System.out.println("Площадь боковой поверхности цилиндра "+c.ploboka());
        System.out.println("Площадь цилиндра "+c.plocili());
        System.out.println("Объем цилиндра "+c.obcili());



    }
}
