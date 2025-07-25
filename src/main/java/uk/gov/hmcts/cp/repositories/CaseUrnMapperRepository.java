package uk.gov.hmcts.cp.repositories;

import org.springframework.stereotype.Repository;
import uk.gov.hmcts.cp.openapi.model.CaseMapperResponse;

@FunctionalInterface
@Repository
public interface CaseUrnMapperRepository {

    CaseMapperResponse getCaseIdByCaseUrn(String caseUrn, Boolean refresh);

}
