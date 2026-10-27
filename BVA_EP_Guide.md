# Black-Box Testing Techniques Reference

## 1. Equivalence Partitioning (EP)
Input data ko valid aur invalid "classes" mein divide karna.
* **Rule:** Har valid class se kam az kam 1 test input lo, aur har invalid class se 1 test input lo.
* **Example (Age 18 to 60):**
  * Valid Partition: `25` (Inside range)
  * Invalid Partition 1: `15` (Below min)
  * Invalid Partition 2: `65` (Above max)

## 2. Boundary Value Analysis (BVA)
BVA, EP ka agla step hai jo boundaries (limits) par focus karta hai.
* **Rule (For range min to max):** Test values honi chahiyein: `Min`, `Min+1`, `Nominal (Aam value)`, `Max-1`, `Max`.
* **Example (Age 18 to 60):**
  * Test Inputs: `17` (Invalid), `18` (Valid Min), `19` (Valid Min+1), `30` (Nominal), `59` (Valid Max-1), `60` (Valid Max), `61` (Invalid).