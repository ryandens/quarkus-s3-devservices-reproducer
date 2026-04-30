# Quarkus S3 Devservices Test Reproducer

Upgrading Quarkus causes a test suite with multiple `QuarkusTest`s that use an S3 devservice to fail.


1. Successful build scan on 3.21.4: https://scans.gradle.com/s/czpli4ap44syq
2. Failed build scan after upgrade to 3.22.1: https://scans.gradle.com/s/dxvfjfdexhygg
3. Build still failing on 3.24.0.CR1: https://scans.gradle.com/s/bmgpbs5wm5h26
4. Fixed in Quarkus 3.34.6 with Quarkus Amazon Services 3.18.0: https://github.com/ryandens/quarkus-s3-devservices-reproducer