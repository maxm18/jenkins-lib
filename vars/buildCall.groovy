#!/usr/bin/env groovy
def call() {
  build job: "Downstream", parameters: [booleanParam(name: 'isTrue', value: params.isTrue)]
}