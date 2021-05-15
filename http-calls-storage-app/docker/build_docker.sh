VERSION=$1

SRC="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

(
    cd $SRC/..
    mvn clean package
    cp target/spring-boot-0.0.1-SNAPSHOT.jar docker/spring-boot-0.0.1-SNAPSHOT.jar
)

docker build -t "jsmadis/http-calls-storage-app:$VERSION" $SRC
docker tag "jsmadis/http-calls-storage-app:$VERSION" jsmadis/http-calls-storage-app:latest
