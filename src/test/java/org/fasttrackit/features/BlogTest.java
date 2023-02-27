package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class BlogTest extends BaseTest {

    @Test
    public void PostAComment() {
        blogSteps.BlogElement();
        blogSteps.typeComment("This product is of very good quality");
        blogSteps.typeName("Jane");
        blogSteps.typeUserEmail(Constants.USER_EMAIL);
        blogSteps.typeWebsite(Constants.BASE_URL);
        blogSteps.ClickOnButton();
    }
}
