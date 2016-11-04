package com.razorfish.leet

import org.scalatest.FlatSpec

class LeetTest extends FlatSpec {
  implicit val leet = Solution

  "Let's have some fun." should
    "return: L37'5 h4v3 50m3 fun." in {
    val input = "Let's have some fun."
    val output = "L37'5 h4v3 50m3 fun."

    assert(Leet.apply(input) === output)
  }

  "C is for cookie, that's good enough for me" should
    "return: C 15 f0r c00k13, 7h47'5 g00d 3n0ugh f0r m3" in {
    val input = "C is for cookie, that's good enough for me"
    val output = "C 15 f0r c00k13, 7h47'5 g00d 3n0ugh f0r m3"

    assert(Leet.apply(input) === output)
  }

  "By the power of Grayskull!" should
    "return: By 7h3 p0w3r 0f Gr4y5kull!" in {
    val input = "By the power of Grayskull!"
    val output = "By 7h3 p0w3r 0f Gr4y5kull!"

    assert(Leet.apply(input) === output)
  }
}
