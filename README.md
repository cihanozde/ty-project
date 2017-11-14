# ty-project

Projeyi çalıştırmak için, PropertyReader projesinden

“mvn clean compile assembly:single”

komutu ile projenin bağımlılıkları ile birlikte bir jar oluşturulmalıdır. ardından

 mvn install:install-file -Dfile={userdir}/PropertyReader/target/propertyreader-jar-with-dependencies.jar -DgroupId=com.cihan.property -DartifactId=PropertyReader -Dversion=1.2-SNAPSHOT -Dpackaging=jar

komutu ile proje target klasörü altında oluşturulan jar, lokalde bulunan maven repositorysinin altına bağımlılık olarak eklenmelidir. 
