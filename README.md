# Spark-Java 

Step 1 : Create maven project – File > New > Project > 

Step 2 : Add required dependencies in pom.xml also change jdk 1.7 to 1.8 

Step 3 : Write code in class and then do maven install 

Step 4 : Now Go to below link and download Apache spark 

https://spark.apache.org/downloads.html 

Unzip file and add environment variables 

Step 5 : Run following command into command prompt 

spark-submit --class org.example.App --master local[3] C:\Users\ws_htu745\IdeaProjects\SparkJava\target\SparkJava-1.0-SNAPSHOT.jar 

Spark-submit --class <package.mainclass> --master local[number of executors / threads] <jar file path> 

Step 6 : On successful run of above command it will provide SparkUI link 

Step 7 : We can observe details about the job on Spark UI 

http://htwpunltp0617.hoonartek03.net:4040/ 
