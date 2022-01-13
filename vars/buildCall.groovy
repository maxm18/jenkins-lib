#!/usr/bin/env groovy
def call(String job = "Downstream") {
  build job: job, parameters: [booleanParam(name: 'isTrue', value: params.isTrue)]
}