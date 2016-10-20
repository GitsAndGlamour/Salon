# CF example app: salon

This is an app to manage salon inventory, staffing and appointment scheduling. It's currently in early development, so there is not much functionality built into it. This application utilizes PCF, Spring Boot, MySQL, H2, flyWay, Angular & Angular Material.

It has an [acceptance test suite][acceptance-test] you might like to look at.

**Note**: We highly recommend that you use the latest versions of any software required by this sample application. For example, make sure that you are using the most recent verion of maven.

## Running on [Pivotal Web Services][pws]

Log in.

```bash
cf login -a https://api.run.pivotal.io
```

Target your org / space.

```bash
cf target -o myorg -s salon
```

Sign up for a cleardb instance.

```bash
cf create-service cleardb spark mysql
```

Build the app.

```bash
brew install maven
mvn package
```

Push the app. Its manifest assumes you called your ClearDB instance 'salon'.

```bash
cf push -n mysubdomain
```

Export the test host

```bash
export HOST=http://mysubdomain.cfapps.io
```

## Running locally

The following assumes you have a working Java 1.8 SDK installed.

Install and start mysql:

```bash
brew install mysql
mysql.server start
mysql -u root
```

Create a database user and table in the MySQL REPL you just opened:

```sql
CREATE USER 'root'@'localhost' IDENTIFIED BY 'root';
CREATE DATABASE salon;
GRANT ALL ON salon.* TO 'root'@'localhost';
exit
```

Start the application server from your IDE or the command line:

```bash
mvn spring-boot:run
```

Export the test host

```bash
export HOST=http://localhost:8080
```
