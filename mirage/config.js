export default function () {
  this.namespace = 'api';

  let sightings = [{
    type: 'sighting',
    id: 1,
    attributes: {
      location: 'Atlanta',
      sighted_at: new Date('2012-10-24')
    }
  }, {
    type: 'sighting',
    id: 2,
    attributes: {
      location: 'Calloway',
      sighted_at: new Date('2012-09-24')
    }
  }, {
    type: 'sighting',
    id: 3,
    attributes: {
      location: 'Asilomar',
      sighted_at: new Date('2012-12-24')
    }
  }];

  let witnesses = [{
    type: 'witness',
    id: 1,
    attributes: {
      'f_name': "Todd",
      'l_name': "Gandee",
      email: "test@gmail.com"
    }
  },
    {
      type: 'witness',
      id: 2,
      attributes: {
        'f_name': "Nekit",
        'l_name': "Shitikov",
        email: "nekit@gmail.com"
      }
    }];

  let cryptids = [{
    type: 'cryptid',
    id: 1,
    attributes: {
      'name': "Chudo",
      'cryptid_type': "middle",
      'profile_img': "/assets/images/cryptids/chupacabra_th.png"
    }
  },
    {
      type: 'cryptid',
      id: 2,
      attributes: {
        'name': "Texx",
        'cryptid_type': "middle",
        'profile_img': "/assets/images/cryptids/loch_ness_th.png"
      }
    }];

  this.get('/sightings', function () {
    return {
      data: sightings
    };
  });

    this.get('/witnesses', function () {
      return {
        data: witnesses
      }
    });

    this.get('/cryptids', function () {
      return {
        data: cryptids
      }
    });

  this.get('/cryptids/:cryptid_id', function (db, request) {
    return {
      data: cryptids.find((cryptid) => {
        console.log(cryptid);
        request.params.cryptid_id === cryptid.cryptid_id
        return cryptid
      })
    };
  });

}
