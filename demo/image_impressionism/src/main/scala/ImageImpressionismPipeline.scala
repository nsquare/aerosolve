package com.airbnb.aerosolve.demo.ImageImpressionism;

import org.apache.spark.{SparkContext, SparkConf}
import org.slf4j.{LoggerFactory, Logger}
import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import scala.collection.JavaConversions._

object ImageImpressionismPipeline {
  val log: Logger = LoggerFactory.getLogger("ImageImpressionismPipeline")

  def makeTrainingRun(sc : SparkContext, config : Config) = {

  }
}