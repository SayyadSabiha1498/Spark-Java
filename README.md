# Spark-Java 

Step 1 : Clone project and do maven install. Copy the path of jar.

Step 2 : Now Go to below link and download Apache spark 

https://spark.apache.org/downloads.html 

Unzip file and add environment variables 

Step 3 : Run following command into command prompt 

spark-submit --class org.example.App --master local[3] C:\Users\ws_htu745\IdeaProjects\SparkJava\target\SparkJava-1.0-SNAPSHOT.jar 

Spark-submit --class <package.mainclass> --master local[number of executors] <jar file path> 

Step 4 : On successful run of above command it will provide SparkUI link 

Step 5 : We can observe details about the job on Spark UI 

http://htwpunltp0617.hoonartek03.net:4040/ 
