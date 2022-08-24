package org.example;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.sql.SparkSession;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
/*
        creating spark session - it is like a configuration
        builder -> will create session
        getOrCreate -> will give session if exist otherwise create new session
        master -> number of threads need to run
*/
        SparkSession session = SparkSession
                .builder()
                .appName("SparkJavaExample")
                .master("local[3]")
                .getOrCreate();

        /*
        * JavaSparkContext -> Driver class
        * parallelize -> number of threads / executors running in parallel
        * */
        try (JavaSparkContext context = new JavaSparkContext(session.sparkContext())) {
            List<Integer> integers = Arrays.asList(1, 4, 5, 6, 7, 8, 9,
                    10, 11, 12, 13, 14, 15);

            JavaRDD<Integer> javaRDD = context.parallelize(integers, 3);

            javaRDD
                    .foreach((VoidFunction<Integer>) integer -> {

                        System.out.println("Java RDD:" + integer);
                        Thread.sleep(3000);
                    });

            Thread.sleep(1000000);
            context.stop();
        }
    }
}
