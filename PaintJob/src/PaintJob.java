public class PaintJob {

    public static int getBucketCount (double width , double height , double areaPerBucket , int extraBuckets){

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;

        double area = width * height - areaPerBucket * extraBuckets;

        double areaPerBucket1 = 0;
        int count = 0;

        while (areaPerBucket1 <= area) {

            areaPerBucket1+= areaPerBucket;
            count++;

        }

        return count;
    }

    public static int getBucketCount (double width , double height , double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;

        double area = width * height;

        double areaPerBucket1 = 0;
        int count = 0;

        while (areaPerBucket1 <= area) {

            areaPerBucket1+= areaPerBucket;
            count++;

        }

        return count;

    }

    public static int getBucketCount (double area , double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) return -1;

        double areaPerBucket1 = 0;
        int count = 0;

        while (areaPerBucket1 <= area) {

            areaPerBucket1+= areaPerBucket;
            count++;

        }

        return count;

    }

}

/*public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) return -1;
        return (int) Math.ceil((width*height-(areaPerBucket*extraBuckets))/areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<=0 || height<=0 || areaPerBucket<=0) return -1;
        return (int) Math.ceil(width*height/areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area<=0 || areaPerBucket<=0) return -1;
        return (int) Math.ceil(area/areaPerBucket);
    }
}


    Concise solution using Ternary Operators for validation:

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        return (width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) ? -1 : (int) Math.ceil((width*height-(areaPerBucket*extraBuckets))/ areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        return (width<=0 || height<=0 || areaPerBucket<=0) ? -1 : (int) Math.ceil(width*height/areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        return (area<=0 || areaPerBucket<=0) ? -1 : (int) Math.ceil(area/areaPerBucket);
    }
}*/
