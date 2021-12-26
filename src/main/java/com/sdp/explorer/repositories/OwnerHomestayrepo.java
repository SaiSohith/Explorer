package com.sdp.explorer.repositories;

import com.sdp.explorer.models.OwnerHomestayOffer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OwnerHomestayrepo extends JpaRepository<OwnerHomestayOffer,Integer> {
    public OwnerHomestayOffer findByOfferid(int oid);
}
