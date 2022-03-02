@Smoke
Feature: Login registration

  Background: Open website Amazon
    Given I'm open website https://www.amazon.com/


    Scenario: Verify I can login with valid email
      Given I'm logged in to https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F%26tag%3Dgoogleglobalp-20%26ref%3Dnav_signin%26adgrpid%3D82342659060%26hvpone%3D%26hvptwo%3D%26hvadid%3D393490894249%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D5024111067265470265%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9047071%26hvtargid%3Dkwd-10573980%26hydadcr%3D2246_11095896%26gclid%3DCj0KCQiA3rKQBhCNARIsACUEW_aT4o_N63eVylUXnFb_sikKiqcfMlPemMWjAz8jktuk5pus-GThE1YaAg7ZEALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&
      When I'm enter solomons@gmail.com to email field
      And I'm must click continue
      Then I'm must successfully logged in to the Amazon



      Scenario: I'm choose a delivery address
        When I'm click button Deliver to field
        And I'm choose an address Russian Federation
        And I'm must click button Done
        Then I must successfully select a shipping address to the Russian Federation

