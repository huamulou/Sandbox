package com.sandbox.chapter7_PackagesAndImports.scopeRules

/**
 * Created by jin1 on 2014/8/5.
 */
package com {
  package horstmann {
    object Utils {
      def percentOf(value: Double, rate: Double) = value * rate / 100
    }

    package impatient {
      class Employee(initialSalary: Double) {
        private var salary = initialSalary
        def description = "An employee with salary " + salary
        def giveRaise(rate: scala.Double) {
          salary += Utils.percentOf(salary, rate)
          // Ok to access Utils from parent package
        }
      }
    }
  }
}
