# decathlon-point-calculator

## Overview

Spring Boot Application for calculating decathlon points.

The microservice provides the following:

1. Ability to calculate decathlon points based on sport name and result.

## Running the application

You can run it as a standalone jar in a few different ways:
you should create docker image with running the dockerFile (
located `decathlon-point-calculator/Dockerfile`  ) and then run the docker-compose.yml file (located
in `decathlon-point-calculator` )
`
docker-compose up
`
or
`
mvn spring-boot:run
`

Or you can just run it in IntelliJ as a standard SpringBoot configuration.

After running the service please visit:
```  http://localhost:8080/decathlon/v1/point-calculations ```
enter the sport name from drop-down list, and input your result in that sport.
With clicking ```  Calculate ```  button, you will see your decathlon point the screen.

#### Sport can have the following values

```
  HUNDRED_METRES,
    LONG_JUMP,
    SHOT_PUT,
    HIGH_JUMP,
    FOUR_HUNDRED_METRES,
    ONE_HUNDRED_AND_TEN_METRES_HURDLES,
    DISCUS_THROW,
    POLE_VAULT,
    JAVELIN_THROW,
    ONE_POINT_FIVE_KILOMETERS
    
```

#### Sport parameters for calculating the decathlon points:

```
    hundred-metres:
      A: 25.4347
      B: 18
      C: 1.81
      TYPE: TRACK
    long-jump:
      A: 0.14354
      B: 220
      C: 1.4
      TYPE: FIELD
    shot-put:
      A: 51.39
      B: 1.5
      C: 1.05
      TYPE: FIELD
    high-jump:
      A: 0.8465
      B: 75
      C: 1.42
      TYPE: FIELD
    four-hundred_metres:
      A: 1.53775
      B: 82
      C: 1.81
      TYPE: TRACK
    one-hundred-and-ten-metres-hurdles:
      A: 5.74352
      B: 28.5
      C: 1.92
      TYPE: TRACK
    discus-throw:
      A: 12.91
      B: 4
      C: 1.1
      TYPE: FIELD
    pole-vault:
      A: 0.2797
      B: 100
      C: 1.35
      TYPE: FIELD
    javelin-throw:
      A: 10.14
      B: 7
      C: 1.08
      TYPE: FIELD
    one-point-five-kilometers:
      A: 0.03768
      B: 480
      C: 1.85
      TYPE: TRACK
```