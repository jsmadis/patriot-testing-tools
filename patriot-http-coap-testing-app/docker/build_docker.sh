VERSION=$1

SRC="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

(
    cd $SRC/..
    mvn clean package
    cp target/rest-service-0.0.1-SNAPSHOT.jar docker/rest-service-0.0.1-SNAPSHOT.jar
)

docker build -t "jsmadis/patriot-http-coap-testing-app:$VERSION" $SRC
docker tag "jsmadis/patriot-http-coap-testing-app:$VERSION" jsmadis/patriot-http-coap-testing-app:latest
