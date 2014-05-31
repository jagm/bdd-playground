/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pl.jagm.playground.bdd

import geb.spock.GebReportingSpec
import spock.lang.Stepwise

@Stepwise
class HelloAppSpec extends GebReportingSpec {

    def "go to hello app"() {
        when:
        go('http://localhost:8080/bdd/') // uses base url system property

        then:
        $('h1').text() == 'Hello world!'
    }

}