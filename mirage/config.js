export default function () {
  this.namespace = 'api';

  this.get('/sightings', function () {
    return {
      data: [{
        type: 'sighting',
        id: '1',
        attributes: {
          location: 'Atlanta',
          sighted_at: new Date('2012-10-24')
        }
      }, {
        type: 'sighting',
        id: '2',
        attributes: {
          location: 'Calloway',
          sighted_at: new Date('2012-09-24')
        }
      }, {
        type: 'sighting',
        id: '3',
        attributes: {
          location: 'Asilomar',
          sighted_at: new Date('2012-12-24')
        }
      }]
    };
  }),

    this.get('/witnesses', function () {
      return {
        data: [{
          type: 'witness',
          id: '1',
          attributes: {
            'f_name': "Todd",
            'l_name': "Gandee",
            email: "test@gmail.com"
          }
        },
          {
            type: 'witness',
            id: '2',
            attributes: {
              'f_name': "Nekit",
              'l_name': "Shitikov",
              email: "nekit@gmail.com"
            }
          }]
      }
    }),
    this.get('/cryptids', function () {
      return {
        data: [{
          type: 'cryptid',
          id: '1',
          attributes: {
            'name': "Chudo",
            'cryptid_type': "middle",
            'profile_img': "assets/images/cryptids/chupacabra_th.png"
          }
        },
          {
            type: 'cryptid',
            id: '2',
            attributes: {
              'name': "Texx",
              'cryptid_type': "middle",
              'profile_img': "assets/images/cryptids/loch_ness_th.png"
            }
          }
        ]
      }
    }),
    this.get('cryptids/:cryptid_id', function () {
      return {
        data: [{
          type: 'cryptid',
          id: '1',
          attributes: {
            'name': "Chudo",
            'cryptid_type': "middle",
            'profile_img': "assets/images/cryptids/chupacabra_th.png"
          }
        },
          {
            type: 'cryptid',
            id: '2',
            attributes: {
              'name': "Texx",
              'cryptid_type': "middle",
              'profile_img': "assets/images/cryptids/loch_ness_th.png"
            }
          }
        ]
      }
    })
}
