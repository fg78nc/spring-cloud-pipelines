package org.springframework.cloud.pipelines.spinnaker.pipeline

import java.util.List

import groovy.transform.CompileStatic

@CompileStatic
class Stages {
	List<Clusters> clusters = []
	String name
	String refId
	List<String> requisiteStageRefIds = []
	String type
}