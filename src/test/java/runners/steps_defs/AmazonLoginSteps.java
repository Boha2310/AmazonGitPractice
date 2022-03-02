package runners.steps_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonLoginSteps {

    @Given("I'm open website https:\\/\\/www.amazon.com\\/")
    public void i_m_open_website_https_www_amazon_com() {
        System.out.println("I'm on Amazon.com");
    }
    @Given("I'm logged in to https:\\/\\/www.amazon.com\\/ap\\/signin?openid.pape.max_auth_age={int}&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F%26tag%3Dgoogleglobalp-{int}%26ref%3Dnav_signin%26adgrpid%3D82342659060%26hvpone%3D%26hvptwo%3D%26hvadid%3D393490894249%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D5024111067265470265%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9047071%26hvtargid%3Dkwd-{int}%26hydadcr%3D2246_{int}%26gclid%3DCj0KCQiA3rKQBhCNARIsACUEW_aT4o_N63eVylUXnFb_sikKiqcfMlPemMWjAz8jktuk5pus-GThE1YaAg7ZEALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.{int}%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.{int}%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.{int}&")
    public void i_m_logged_in_to_https_www_amazon_com_ap_signin_openid_pape_max_auth_age_openid_return_to_https_3a_2f_2fwww_amazon_com_2f_3f_26tag_3dgoogleglobalp_26ref_3dnav_signin_26adgrpid_3d82342659060_26hvpone_3d_26hvptwo_3d_26hvadid_3d393490894249_26hvpos_3d_26hvnetw_3dg_26hvrand_3d5024111067265470265_26hvqmt_3de_26hvdev_3dc_26hvdvcmdl_3d_26hvlocint_3d_26hvlocphy_3d9047071_26hvtargid_3dkwd_26hydadcr_3d2246_26gclid_3d_cj0kc_qi_a3r_kq_bh_cnar_is_acuew_a_t4o_n63e_vyl_u_xn_fb_sik_kiqcf_ml_pem_m_wj_az8jktuk5pus_g_th_e1ya_ag7zea_lw_wc_b_openid_identity_http_3a_2f_2fspecs_openid_net_2fauth_2f2_2fidentifier_select_openid_assoc_handle_usflex_openid_mode_checkid_setup_openid_claimed_id_http_3a_2f_2fspecs_openid_net_2fauth_2f2_2fidentifier_select_openid_ns_http_3a_2f_2fspecs_openid_net_2fauth_2f2(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6, Integer int7) {
        System.out.println("I'm on Amazon registration");
    }
    @When("I'm enter solomons@gmail.com to email field")
    public void i_m_enter_solomons_gmail_com_to_email_field() {
        System.out.println("I'm enter solomons@gmail.com to email field");
    }
    @When("I'm must click continue")
    public void i_m_must_click_continue() {
        System.out.println("\"I'm must click continue");
    }
    @Then("I'm must successfully logged in to the Amazon")
    public void i_m_must_successfully_logged_in_to_the_amazon() {
        System.out.println("I'm must successfully logged in to the Amazon");
    }
    
    
    
    
    ///


    @When("I'm click button Deliver to field")
    public void i_m_click_button_deliver_to_field() {
        System.out.println("I'm click button Deliver to field");
    }
    @When("I'm choose an address Russian Federation")
    public void i_m_choose_an_address_russian_federation() {
        System.out.println("I'm choose an address Russian Federation");
    }
    @When("I'm must click button Done")
    public void i_m_must_click_button_done() {
        System.out.println("I'm must click button Done");
    }
    @Then("I must successfully select a shipping address to the Russian Federation")
    public void i_must_successfully_select_a_shipping_address_to_the_russian_federation() {
        System.out.println("I must successfully select a shipping address to the Russian Federation");
    }



}
