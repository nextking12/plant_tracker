import { useState } from 'react';

const PlantList = () => {
  const [plants] = useState([
    { id: 1, name: 'Snake Plant', waterFrequency: '2 weeks' },
    { id: 2, name: 'Monstera', waterFrequency: '1 week' },
    { id: 3, name: 'Pothos', waterFrequency: '10 days' }
  ]);

  return (
    <div className="space-y-4">
      {plants.map(plant => (
        <div key={plant.id} className="p-4 border rounded-lg shadow-sm">
          <h3 className="font-medium">{plant.name}</h3>
          <p className="text-gray-600">Water every: {plant.waterFrequency}</p>
        </div>
      ))}
    </div>
  );
};

const App = () => {
  return (
    <div className="max-w-2xl mx-auto p-6">
      <h1 className="text-3xl font-bold mb-6 text-center">My Plants</h1>
      <PlantList />
    </div>
  );
};

export default App;