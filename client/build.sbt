name := """stressTest"""

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "2.2.4" % "test",
	"redis.clients" % "jedis" % "2.8.0",
	"biz.paluch.redis" % "lettuce" % "4.0.2.Final",
	"org.redisson" % "redisson" % "2.2.5"
)